plugins {
    java
    id("com.diffplug.spotless") version "6.11.0"
    id("com.github.ben-manes.versions") version "0.43.0"
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.assertj:assertj-core:3.23.1")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

