# MidProject
The Farasan Island Trip Booking System :
its designed to streamline the process of booking trips to the beautiful Farasan Island.

# How It Works:
User Registration :
Users begin by registering on the platform, providing their name and Id
and email address.
Users can explore a list of available Farasan trips.
Users can select a Farasan trip they are interested in and they wish to book.
The system checks seat availability, ensuring that there are seats available for booking.
# Class Diagram:
![image](https://github.com/Manar-20/MidProject/assets/111026905/4fcb99b6-d83b-4e63-9e1a-c4b14f43d6bf)

# Setup:
To run this project on your local machine, follow these steps:

Clone the repository to your local machine.
Open the project in your Intellij IDEA .
Configure the database connection in the application.properties file.
# Technologies Used :
Java
Spring Boot
Spring Data JPA
Spring MVC

# Controllers and Routes Structure :
Admin Controller:

POST /create-Admin: Create a new admin.
GET /Admins: Retrieve a list of all admins.
DELETE /delete-Admin/{userId}: Delete an admin by ID.
Booking Controller:

POST /Add-new-booking: Create a new booking.
GET /All-Booking: Retrieve a list of all bookings.
DELETE /delete-Booking/{bookingId}: Delete a booking by ID.
Customer Controller:

POST /new-Customer: Create a new customer.
GET /Customer: Retrieve a list of all customers.
DELETE /delete/{userId}: Delete a customer by ID.
FarasanTrip Controller:

POST /add-new-Trip: Add a new trip.
GET /trips: Retrieve a list of all trips.
PUT /Update-Trip_Info/{farryName}: Update trip information by name.

# Extra Links :
Trello Board :https://trello.com/invite/b/2ahy7clL/ATTI9efab39ec5fdf5dc1d793c55ea0dc97eEB604443/mid-project
Presentation Slides : https://www.canva.com/design/DAFyTuhyy9w/Dm-caRhSyuVg-SwgneheQw/edit?utm_content=DAFyTuhyy9w&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton
# Future Work:
In the future, we plan to implement additional features such as:
User authentication and authorization
Improved user interface
Payment integration

# Resources
Spring Boot Documentation
Spring Data JPA Guide



