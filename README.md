### **Spring Boot Web Application – Automated CI/CD Pipeline**  

🚀 This repository contains a **Spring Boot (Maven) web application** with a fully automated **CI/CD pipeline** using **Jenkins, Docker, SonarQube, and Trivy**. The deployment is done on an **AWS EC2 instance** running Docker.   

---
 
## 📌 **Project Overview** 
This project demonstrates a **DevOps workflow** for automating the deployment of a Spring Boot application using:  
✅ **Jenkins** – CI/CD automation  
✅ **Maven** – Build management  
✅ **SonarQube** – Code quality analysis  
✅ **Docker** – Containerization  
✅ **Trivy** – Security vulnerability scanning  
✅ **AWS EC2** – Deployment server  

---

## 🛠 **CI/CD Pipeline Workflow**  
1️⃣ **Git Checkout** – Pulls the latest code from GitHub.  
2️⃣ **Maven Build** – Compiles and packages the application.  
3️⃣ **SonarQube Analysis** – Scans for bugs, security issues, and code smells.  
4️⃣ **Docker Build** – Creates a containerized application.  
5️⃣ **Trivy Scan** – Checks for security vulnerabilities.  
6️⃣ **Push to Docker Registry** – Uploads the image to Docker Hub / AWS ECR.  
7️⃣ **Deploy to AWS EC2** – Pulls the latest image, stops the old container, and runs the new one.  
8️⃣ **Email Notifications** – Sends success/failure alerts.  

---

## 🏗 **Setup & Installation**  

### **1️⃣ Prerequisites**  
Ensure you have the following installed:  
- **JDK 17+**  
- **Maven**  
- **Docker**  
- **Jenkins (with required plugins)**  
- **SonarQube Server**  
- **Trivy Scanner**  

### **2️⃣ Build & Run Locally**  
Clone the repository and build the project:  
```sh
git clone https://github.com/suryaprakash-r/blog-app.git
cd blog-app
mvn clean package
```
Run the application:  
```sh
mvn spirng-boot:run
```

### **3️⃣ Run with Docker**  
```sh
docker build -t myapp .
docker run -p 8080:8080 myapp
```

### **4️⃣ Deployment on AWS EC2**  
SSH into the server and pull the latest image:  
```sh
docker pull your-dockerhub-repo/myapp:latest
docker stop myapp-container || true
docker rm myapp-container || true
docker run -d -p 8080:8080 --name myapp-container your-dockerhub-repo/myapp:latest
```

---

## 📊 **Monitoring & Logs**  
View logs inside the container:  
```sh
docker logs -f myapp-container
```
Check running containers:  
```sh
docker ps
```

---

## 🚀 **Future Enhancements**  
🔹 **Automating deployment using ArgoCD (GitOps approach).**  
🔹 **Integrating Kubernetes (EKS) for scalability.**  
🔹 **Adding Nginx Ingress for URL-based routing.**  
🔹 **Monitoring with Grafana & Prometheus.**  

---

## 🤝 **Contributing**  
Feel free to **fork** this repo, **raise issues**, and submit **pull requests** to improve the project! 🚀  

---

## 📩 **Contact**  
💡 Have questions or suggestions? Reach out via **LinkedIn** or open a GitHub issue.  

---

This README provides **everything** a developer or contributor needs to **understand, set up, and contribute** to your project! Let me know if you need any tweaks. 🚀🔥
