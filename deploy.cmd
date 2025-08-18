@echo off
echo Building Weather Traffic App Backend...

REM Clean and build the project
call mvnw.cmd clean package -DskipTests

if %ERRORLEVEL% neq 0 (
    echo Build failed!
    exit /b 1
)

echo Build successful!
echo JAR file created at: target\Backend-0.0.1-SNAPSHOT.jar

echo.
echo To run the application:
echo java -jar target\Backend-0.0.1-SNAPSHOT.jar
echo.
echo Or with production profile:
echo java -jar -Dspring.profiles.active=prod target\Backend-0.0.1-SNAPSHOT.jar
echo.
echo Application will be available at: http://localhost:8080
echo Health check: http://localhost:8080/actuator/health
echo Weather API: http://localhost:8080/api/weather?city=London