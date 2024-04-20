# EnergyXpert - Technical Test

EnergyXpert is a Java backend program designed to calculate monthly billing amounts for Ekwateur's clients based on their energy consumption. This program handles two types of clients: professional clients and individual clients, each with their own set of properties and pricing rules.

## Table of Contents

- [📖 Introduction](#introduction)
- [🛠 Requirements](#requirements)
- [📁 Project Structure](#project-structure)
- [🏃‍♂️ How to Run](#how-to-run)
- [🧪 Tests](#tests)
- [🤝 Contributing](#contributing)
- [📝 License](#license)

## Introduction

The program is designed to calculate billing amounts accurately and efficiently based on various client profiles and energy consumption data.

## Requirements

The program is built using Java 17 and Maven for dependency management. It follows object-oriented principles and design patterns such as strategy pattern for billing strategies.

## Project Structure

The project is structured as follows:

- **entities**: Contains entity classes representing different types of clients.
- **services**: Contains billing service and strategy interfaces and implementations.
- **utils**: Contains utility classes for client and billing data processing.

## How to Run

To run the EnergyXpert program, follow these steps:

1. Clone the repository to your local machine.
2. Ensure you have Java 8 and Maven installed.
3. Navigate to the project directory.
4. Run `mvn clean install` to build the project.
5. Run `java -jar target/EnergyXpert.jar` to execute the program.

## Tests

The project includes unit tests to ensure the correctness of the billing calculations and overall functionality. These tests cover various client scenarios and billing strategies.

To run the tests, execute `mvn test` in the project directory.

## Contributing

Contributions to the project are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
