# Advanced Signup System

A secure user registration application built with Java Spring Boot, MySQL, and AJAX, designed with a focus on data validation, password security, and maintainable backend architecture.

## Features

- **Secure Password Hashing:** Implements Argon2id to protect stored user passwords.
- **Input Validation:** Validates registration fields using Jakarta Bean Validation.
- **Email Verification Checks:** Validates email format and prevents duplicate email registrations.
- **Password Confirmation:** Ensures password and confirmation fields match.
- **Database Integration:** Uses Spring Data JPA and Hibernate with MySQL.
- **Asynchronous Requests:** Uses jQuery AJAX for form submission without a full-page reload.
- **Centralized Exception Handling:** Provides consistent handling of application errors.
- **Application Logging:** Supports debugging and application monitoring.

## Technology Stack

| Component | Technology |
|---|---|
| Backend | Java 17, Spring Boot |
| Frontend | HTML5, CSS3, JavaScript, jQuery, AJAX |
| Database | MySQL |
| Persistence | Spring Data JPA, Hibernate |
| Security | Argon2id Password Hashing |
| Validation | Jakarta Bean Validation |
| Build Tool | Gradle |

## Getting Started

### Prerequisites
- Java 17 or later
- MySQL 8 or later
- Git

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/badhuio/adavancedSignup.git
   ```
2. Create the `loginAdvanced` database in MySQL.
3. Configure database credentials through environment variables or local configuration.
4. Run the application on Windows:
   ```powershell
   .\gradlew.bat bootRun
   ```

## Security Practices

- Hash passwords using Argon2id before database storage.
- Keep database credentials out of source control.
- Exclude log files and sensitive configuration from Git.
- Validate user input on the server side.

## Author

**Badhusha Yousaf**

- GitHub: https://github.com/badhuio
- LinkedIn: https://www.linkedin.com/in/badhusha-yousaf/
