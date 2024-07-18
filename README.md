# Splitwise Project

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Introduction
The Splitwise Project is a bill-splitting application that helps users manage shared expenses and settle up debts. It simplifies the process of tracking who owes whom and ensures that everyone pays their fair share.

## Features
- Add and manage expenses
- Split bills among multiple users
- Track balances and settlements
- User authentication and management
- Responsive design for mobile and desktop

## Technologies Used
- Frontend: HTML, CSS, JavaScript, React
- Backend: Node.js, Express
- Database: MongoDB
- Authentication: JWT (JSON Web Tokens)

## Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/sanjaikrp/Splitwise.git
    ```
2. Navigate to the project directory:
    ```sh
    cd Splitwise
    ```
3. Install the dependencies:
    ```sh
    npm install
    ```
4. Set up the environment variables:
    ```sh
    cp .env.example .env
    ```
5. Start the development server:
    ```sh
    npm start
    ```

## Usage
1. Open your web browser and navigate to `http://localhost:3000`.
2. Register a new account or log in with an existing account.
3. Create groups and add expenses to split bills among group members.
4. Track your balances and settle up debts with your friends.

## API Endpoints
### Authentication
- `POST /api/register` - Register a new user
- `POST /api/login` - Log in an existing user

### Users
- `GET /api/users` - Get all users
- `GET /api/users/:id` - Get a specific user

### Groups
- `POST /api/groups` - Create a new group
- `GET /api/groups` - Get all groups
- `GET /api/groups/:id` - Get a specific group

### Expenses
- `POST /api/expenses` - Add a new expense
- `GET /api/expenses` - Get all expenses
- `GET /api/expenses/:id` - Get a specific expense

### Settlements
- `POST /api/settlements` - Record a settlement
- `GET /api/settlements` - Get all settlements

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
