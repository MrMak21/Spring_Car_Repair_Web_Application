<h1>SpringBoot Applications</h1>

The aim of this repository is to learn Spring Boot and develop a CRUD application regarding a Car Repair Shop so as to deeply understand design patterns regarding the 3-tier Architecture used by this MVC framework.

<h5>This is a project made in the days of <strong>Project Future</strong>(powered by Peiraus Bank, Code.Hub ,Regeneration)</h5>

<h3>Getting Started</h3>

After importing the project, simply fire up your server (tomcat's port is set to 8081) and click the following:
http://localhost:8081/

The Login page (username/password) is validating the input via the database's password records which are hash encrypted. In order to login and test out the application the following login credentials are given [username/password] :

- User_Role: user / pass1234
- Admin_Role: admin / pass1234

Ρegarding Hash Encryption, user, administrator in these credentials have deliberately the same value. More specifically, even though they have the same (string) value, they are stored differently to our database. More specifically, User_Role Password is encrypted as: $10$FKg42N1H9SytX7kr6m7TGu8T4uOcAdF5DTZOrI69CxPMVuVMm9iiy

whereas

Admin_Role Password is encrypted as: $2a$10$vYxq4JAQ2YTpleuCoYRtvOP8bcfS9gfgmbJU7L/MRcIGbWmSGtZfS

Admin_Role is encrypted as: $2a$10$vYxq4JAQ2YTpleuCoYRtvOP8bcfS9gfgmbJU7L/MRcIGbWmSGtZfS
Users's Index Page

Depending on the user's credentials the webpage shall display the current Repair status of the car as stored to the database.
Admin's Index Page

The index page consists of the following:

-Contributors page

-Display All Contributors

-User/Owner of a Car page

a. Create New User Entry

b. Display All Entries

c. Update/Delete an Entry

-Car Repair Shop page

a. Create New Repair Entry

b. Display All Entries

c. Update/Delete an Entry

-Search the Database (via User Input)

a. For a user's surname display all available db records

b. For a user's AFM (National Insurance number) display all available db records

c. For a user's Email Adress display all available db records

The project was developed in collaboration with: 
