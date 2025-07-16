dependencies {
    // Core 모듈 의존성
    implementation(project(":core"))
    
    // Message 모듈 특화 의존성
    implementation("org.springframework.boot:spring-boot-starter-web")
    
    // 개발 도구
    developmentOnly("org.springframework.boot:spring-boot-devtools")
}

// plain jar 비활성화, 실행 가능한 jar만 생성
tasks.jar {
    enabled = false
}

tasks.bootJar {
    enabled = true
}