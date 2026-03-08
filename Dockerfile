FROM eclipse-temurin:21
WORKDIR /app
COPY . .
RUN javac desafios/*.java 
CMD ["java", "desafios.ex01"]