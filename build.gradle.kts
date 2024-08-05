plugins {
    java
    id("com.diffplug.spotless") version "6.25.0"
    id("com.github.ben-manes.versions") version "0.51.0"
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
  targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.0-M1")
    testImplementation("org.assertj:assertj-core:3.25.3")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.0-M1")
}

