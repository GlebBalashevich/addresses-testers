import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

plugins {
    java
    id("org.springframework.boot") version "2.4.3" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
}

group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    apply(plugin = "io.spring.dependency-management")

    configure<DependencyManagementExtension> {
        dependencies {
            dependency("org.mapstruct:mapstruct-processor:1.4.2.Final")
            dependency("org.mapstruct:mapstruct:1.4.2.Final")
            dependency("com.lob:lob-java:12.1.0")
        }
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    dependencies {
        annotationProcessor("org.projectlombok:lombok")
        annotationProcessor("org.mapstruct:mapstruct-processor")

        implementation("org.springframework.boot:spring-boot-starter-web")
        implementation("org.projectlombok:lombok")
        implementation("org.mapstruct:mapstruct-processor")
        implementation("org.mapstruct:mapstruct")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }
}


