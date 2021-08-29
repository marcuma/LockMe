# LockMe
Project for Phase1 FSD

Lockme.com Phase 1 Project Developer: Mark Marcum
Please Note: Agile is code over documentation, thus, I did not create a flowchart, UML diagrams or domain specs. Additionally, I could not find a free flowcharting program. The code is self-documenting.
Sprints
Sprint 1
As a user I want to be presented with a welcome menu so that I can choose to register or login
As a user I want to login to LockedMe.com so that I can be presented with an options menu
As a user I want to be presented with an options menu so that I can add, delete, search, and view credentials
Sprint 2
As a user I want to register for the application so that I can store my credentials As a user I want to add a credential so that I can store it and view it later
As a user I want to delete a credential so that I can remove unused sites
Sprint 3
As a user I want to search for a credential so that I can view it and change it As a user I want to view all of my credentials so that I can view them
As a user I want to exit the application
Core Concepts in the program: Encapsulation
Polymorphism
Sorting and Searching
Single responsibility to reduce code duplication and future expansion without refactoring Exception Handling
File and Object Streams
This code was written in such a way that adding additional functionality will be very easy. Views shows the user menus, services take data from the view, get the data from the repository, and passes back data structures for to the view to display back.
 
As a result, this would be a good in the future to have a web based front end. Only the view would have to change, the back would not need to change.
GitHub Link: git@github.com:marcuma/LockMe.git
To execute: Clone the repository and execute from IDE
Directory structure:
Com.simplilearn.lock me Com.simplilearn.lockme.model Com.simplilearn.lockme.repository Com.simplilearn.lockme.service com.simplilearn.lockme.view
