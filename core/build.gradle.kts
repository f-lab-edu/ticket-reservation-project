dependencies {
    // Core 모듈 특화 의존성이 필요한 경우 여기에 추가
    // 예: JPA, Validation 등
}

// Core 모듈은 라이브러리이므로 jar 파일 생성 안함
tasks.jar {
    enabled = false
}

tasks.bootJar {
    enabled = false
}