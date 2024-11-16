# Rest-Assured Java Base API Automation

This project automates API testing for the [Restful-Booker API](https://restful-booker.herokuapp.com/), which provides endpoints for managing hotel bookings. It uses **Rest-Assured** for API requests and validations, along with **TestNG** for test execution and reporting.

## Features
- **Authentication**: Automates the login process and retrieves the authentication token.
- **CRUD Operations**: Covers basic operations for bookings:
  - Create a new booking
  - Read booking details
- **Configurable**: The project reads configuration details from a properties file.
- **Assertions**: Uses `TestNG` for validating API responses.

## Technologies Used
- **Java**
- **Rest-Assured**
- **TestNG**
- **Apache Commons Configuration** (for properties management)

## Prerequisites
1. **Java JDK** (8 or higher)
2. **Maven** (for dependency management)
3. **IDE** (e.g., IntelliJ IDEA, Eclipse)
4. Active internet connection to access the Restful-Booker API.

## Key Endpoints
- **Authentication**: POST /auth 
- **Bookings**: GET /booking/{id}
## Output
![Screenshot 2024-11-16 190021](https://github.com/user-attachments/assets/67a841e6-8396-4767-b53d-f99f912d26dc)

## Contributing
Contributions are welcome! Please fork this repository and submit a pull request for any feature additions or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

