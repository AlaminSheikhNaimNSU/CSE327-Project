Sheik Mehedi Hassan
armzyy_
Do Not Disturb

Sheik Mehedi Hassan — Today at 1:19 AM
hey
https://rds2.northsouth.edu/index.php/common/showofferedcourses
you can take help from this
just search courses
and add
implement with 2-3 section. not more than that
Alamin Sheikh Naim — Today at 1:26 AM
Got your point
but this course list is only available for advising time only
now its not available on nsu server
Sheik Mehedi Hassan — Today at 1:34 AM
https://nsu.app/
check this
Alamin Sheikh Naim — Today at 2:22 AM
check this file out. let me know if any correction needed
package io.github.AlaminSheikhNaimNSU.CSE327_Project;

import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.CourseDescriptionRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.CourseRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.StudentRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.UserRepository;
Expand
DbSeeder.java
32 KB
﻿
package io.github.AlaminSheikhNaimNSU.CSE327_Project;

import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.CourseDescriptionRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.CourseRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.StudentRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.Interface.UserRepository;
import io.github.AlaminSheikhNaimNSU.CSE327_Project.models.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {

    protected static CourseRepository courseRepository;
    private static UserRepository userRepository;
    private static StudentRepository studentRepository;
    private static CourseDescriptionRepository courseDescriptionRepository;

    public DbSeeder(CourseRepository courseRepository,
            UserRepository userRepository,
            StudentRepository studentRepository,
            CourseDescriptionRepository courseDescriptionRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
        this.studentRepository = studentRepository;
        this.courseDescriptionRepository = courseDescriptionRepository;
    }

    public static String deleteAll() {
        courseRepository.deleteAll();
        userRepository.deleteAll();
        studentRepository.deleteAll();
        courseDescriptionRepository.deleteAll();
        System.out.println("DB Details: " + " Users: " + userRepository.count() + " Courses: " + courseRepository.count() + " Course Description: " + courseDescriptionRepository.count() + " Students: " + studentRepository.count());
        return ("Details: " + " Users: " + userRepository.count() + " Courses: " + courseRepository.count() + " Course Description: " + courseDescriptionRepository.count() + " Students: " + studentRepository.count());

    }

    public static String loadAll() {
        // clearing all the tables
        System.out.println("DB Details: " + " Users: " + userRepository.count() + " Courses: " + courseRepository.count() + " Course Description: " + courseDescriptionRepository.count() + " Students: " + studentRepository.count());

        //adding some user to use
        User Mahedi = new User(Mahedi", "Mahedi", "ROLE_ADMIN", "ROLE_USER
        ");
        User admin = new User("admin", "admin", "ROLE_ADMIN", "ROLE_USER");
        userRepository.save(Mahedi);
        userRepository.save(admin);

        // Removing old courses and adding new courses
        courseRepository.deleteAll();

// Deleting old courses and adding new courses
        courseRepository.deleteAll();

// Deleting old courses and adding new courses
        courseRepository.deleteAll();

// Add new courses
        courseRepository.save(new Course("Computing Concepts", "CSE115", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Computing Concepts Lab", "CSE115L", "Department of Computer Science and Engineering", "1", new ArrayList<String>()));
        courseRepository.save(new Course("Fundamentals of Computer Programming", "CSE135", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Fundamentals of Computer Programming Lab", "CSE135L", "Department of Computer Science and Engineering", "1", new ArrayList<String>()));
        courseRepository.save(new Course("Discrete Mathematics", "CSE173", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Data Structures", "CSE225", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Data Structures Lab", "CSE225L", "Department of Computer Science and Engineering", "1", new ArrayList<String>()));
        courseRepository.save(new Course("Digital Logic", "CSE231", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Computer Organization and Design", "CSE232", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Electrical Circuits", "CSE243", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Electrical Circuits Lab", "CSE243L", "Department of Computer Science and Engineering", "1", new ArrayList<String>()));
        courseRepository.save(new Course("Electronics I", "CSE253", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Electronics I Lab", "CSE253L", "Department of Computer Science and Engineering", "1", new ArrayList<String>()));
        courseRepository.save(new Course("Numerical Methods", "CSE257", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Introduction to Theory of Computation", "CSC273", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Electrical and Electronics Circuit Design Laboratory I", "CSE283", "Department of Computer Science and Engineering", "1", new ArrayList<String>()));
        courseRepository.save(new Course("Database Systems", "CSE311", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Operating Systems Design", "CSE323", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Compiler Construction", "CSE326", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Software Engineering", "CSE327", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Microprocessors and Assembly Language Programming", "CSE331", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Computer Networks", "CSE338", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Electronics II", "CSE351", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Electronics II Lab", "CSE351L", "Department of Computer Science and Engineering", "1", new ArrayList<String>()));
        courseRepository.save(new Course("Electrical and Electronics Circuit Design Laboratory II", "CSE353", "Department of Computer Science and Engineering", "1", new ArrayList<String>()));
        courseRepository.save(new Course("Design and Analysis of Algorithms", "CSE373", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Digital Electronics & Microprocessor Design Laboratory", "CSE413", "Department of Computer Science and Engineering", "2", new ArrayList<String>()));
        courseRepository.save(new Course("Internet and Web Technology", "CSE482", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Project/Internship/Special Laboratory Project", "CSE499", "Department of Computer Science and Engineering", "3", new ArrayList<String>()));

        courseRepository.save(new Course("Pre-Calculus", "MAT116", "Department of Mathematics and Physics", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Linear Algebra", "MAT125", "Department of Mathematics and Physics", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Calculus and Analytical Geometry I", "MAT120", "Department of Mathematics and Physics", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Calculus and Analytical Geometry II", "MAT130", "Department of Mathematics and Physics", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Calculus and Analytical Geometry IV", "MAT250", "Department of Mathematics and Physics", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Engineering Mathematics", "MAT350", "Department of Mathematics and Physics", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Probability and Statistics", "MAT361", "Department of Mathematics and Physics", "3", new ArrayList<String>()));

        courseRepository.save(new Course("General Physics I", "PHY107", "Department of Physics", "3", new ArrayList<String>()));
        courseRepository.save(new Course("General Physics I Lab", "PHY107L", "Department of Physics", "1", new ArrayList<String>()));

        courseRepository.save(new Course("General Physics II", "PHY108", "Department of Physics", "3", new ArrayList<String>()));
        courseRepository.save(new Course("General Physics II Lab", "PHY108L", "Department of Physics", "1", new ArrayList<String>()));

        courseRepository.save(new Course("General Chemistry", "CHE101", "Department of Chemistry", "3", new ArrayList<String>()));
        courseRepository.save(new Course("General Chemistry Lab", "CHE101L", "Department of Chemistry", "1", new ArrayList<String>()));

        courseRepository.save(new Course("Intermediate Composition", "ENG103", "Department of English", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Public Speaking", "ENG111", "Department of English", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Environmental Science", "ENV107", "Department of Environmental Science", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Introduction to World Civilization", "HIS102", "Department of History", "3", new ArrayList<String>()));
        courseRepository.save(new Course("History of Bangladesh", "HIS103", "Department of History", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Introduction to Microeconomics", "ECO101", "Department of Economics", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Introduction to Political Science", "POL101", "Department of Political Science", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Introduction to Sociology", "SOC101", "Department of Sociology", "3", new ArrayList<String>()));
        courseRepository.save(new Course("Bengali Literature", "BEN103", "Department of Bengali", "3", new ArrayList<String>()));

        //adding some course description
        courseDescriptionRepository.save(new CourseDescription("CSE499A", "01", "08:30 - 10:00", "S", "AB2-405", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE499A", "02", "11:50 - 01:20", "T", "226", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE499A", "02", "11:50 - 01:20", "R", "225", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE499A", "03", "11:50 - 01:20", "W", "AB2-205", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE499B", "01", "08:30 - 10:00", "A", "112", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE499B", "02", "10:10 - 11:40", "A", "112", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE499B", "03", "08:30 - 10:00", "W", "435", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE373", "01", "10:10 - 11:40", "ST", "AB1-601", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE373", "02", "01:30 - 03:00", "ST", "436", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE373", "02", "01:30 - 03:00", "ST", "AB2-503", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE373", "03", "10:10 - 11:40", "MW", "109", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE425", "01", "11:50 - 01:20", "ST", "115", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE425", "02", "03:10 - 04:40", "ST", "Reading Course", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE440", "03", "01:30 - 03:00", "ST", "109", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE440", "01", "08:30 - 10:00", "MW", "221", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE440", "02", "03:10 - 04:40", "ST", "337", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE327", "01", "10:10 - 11:40", "sT", "AB2-304", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE327", "01", "10:10 - 11:40", "RA", "AB2-304", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE331", "02", "10:10 - 11:40", "MW", "AB1-301", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE331", "03", "01:30 - 03:00", "ST", "AB2-205", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE332", "01", "01:30 - 03:00", "MW", "219", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE332", "02", "01:30 - 03:00", "ST", "550 (Lecture Gallery)", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE323", "01", "01:30 - 03:00", "MW", "AB1-302", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE231", "02", "03:10 - 04:40", "ST", "AB1-302", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE231", "03", "01:30 - 03:00", "ST", "AB1-402", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE231", "04", "11:50 - 01:20", "MW", "AB1-402", "40"));
        courseDescriptionRepository.save(new CourseDescription("HIS102", "05", "11:50 - 01:20", "MW", "AB1-302", "40"));
        courseDescriptionRepository.save(new CourseDescription("HIS103", "01", "10:10 - 11:40", "ST", "532", "40"));
        courseDescriptionRepository.save(new CourseDescription("HIS101", "02", "01:30 - 03:00", "ST", "532", "40"));
        courseDescriptionRepository.save(new CourseDescription("ECO101", "03", "10:10 - 11:40", "MW", "532", "40"));
        courseDescriptionRepository.save(new CourseDescription("SOC101", "04", "01:30 - 03:00", "MW", "532", "40"));
        courseDescriptionRepository.save(new CourseDescription("PBH101", "01", "01:30 - 03:00", "ST", "437", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENV103", "02", "11:50 - 01:20", "MW", "437", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT116", "03", "10:10 - 11:40", "ST", "AB2-503", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT116", "04", "08:30 - 10:00", "MW", "436", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT120", "05", "08:30 - 10:00", "ST", "AB1-502", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT120", "06", "01:30 - 03:00", "MW", "AB1-502", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT125", "01", "10:10 - 11:40", "MW", "212", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT125", "02", "11:50 - 01:20", "MW", "212", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT130", "03", "10:10 - 11:40", "ST", "AB2-405", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT130", "03", "10:10 - 11:40", "RA", "AB2-404", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT250", "04", "01:30 - 03:00", "ST", "212", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT250", "04", "01:30 - 03:00", "RA", "107", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT350", "05", "08:30 - 10:00", "MW", "AB1-301", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT350", "01", "08:30 - 10:00", "RA", "AB1-301", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT361", "02", "01:30 - 03:00", "RA", "AB1-501", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT361", "03", "01:30 - 03:00", "MW", "TBA", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE225", "01", "08:30 - 10:00", "MW", "108", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE225", "02", "11:50 - 01:20", "ST", "AB2-203", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE225", "02", "11:50 - 01:20", "RA", "114", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE299", "03", "08:30 - 10:00", "ST", "AB1-701", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE299", "04", "03:10 - 04:40", "MW", "AB1-501", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG102", "01", "08:30 - 10:00", "MW", "223", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG102", "10", "01:30 - 03:00", "MW", "AB2-503", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG102", "11", "10:10 - 11:40", "ST", "336", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "11", "10:10 - 11:40", "RA", "219", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "12", "01:30 - 03:00", "ST", "AB1-602", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG111", "12", "01:30 - 03:00", "ST", "115", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG111", "13", "08:30 - 10:00", "MW", "115", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG111", "14", "03:10 - 04:40", "ST", "225", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "15", "01:30 - 03:00", "MW", "AB1-602", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "16", "08:30 - 10:00", "ST", "113", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG105", "17", "10:10 - 11:40", "ST", "AB1-602", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG111", "17", "10:10 - 11:40", "RA", "532", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG102", "18", "03:10 - 04:40", "MW", "227", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "19", "10:10 - 11:40", "ST", "AB2-203", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG105", "19", "10:10 - 11:40", "RA", "AB1-401", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG111", "02", "08:30 - 10:00", "ST", "241", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG111", "20", "11:50 - 01:20", "RA", "336", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG102", "20", "11:50 - 01:20", "ST", "AB2-204", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG102", "21", "03:10 - 04:40", "ST", "241", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "21", "03:10 - 04:40", "RA", "225", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG105", "22", "03:10 - 04:40", "MW", "AB2-204", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG111", "23", "08:30 - 10:00", "MW", "AB1-201", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG102", "03", "03:10 - 04:40", "MW", "221", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "04", "08:30 - 10:00", "MW", "111", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "05", "11:50 - 01:20", "MW", "AB2-303", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "06", "11:50 - 01:20", "MW", "222", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG101", "07", "08:30 - 10:00", "RA", "223", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG105", "07", "08:30 - 10:00", "ST", "226", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG105", "08", "08:30 - 10:00", "RA", "AB2-404", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG105", "09", "01:30 - 03:00", "ST", "223", "40"));
        courseDescriptionRepository.save(new CourseDescription("ENG103", "09", "01:30 - 03:00", "ST", "221", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT120", "01", "01:30 - 03:00", "MW", "AB1-202", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT125", "10", "11:50 - 01:20", "MW", "AB1-502", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT116", "12", "11:50 - 01:20", "ST", "TBA", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT130", "13", "08:30 - 10:00", "ST", "TBA", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT116", "02", "11:50 - 01:20", "ST", "AB1-302", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT130", "03", "01:30 - 03:00", "RA", "AB1-302", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT125", "04", "11:50 - 01:20", "ST", "AB1-602", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT130", "05", "03:10 - 04:40", "ST", "AB1-602", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT250", "06", "11:50 - 01:20", "MW", "AB1-301", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT350", "07", "11:50 - 01:20", "RA", "AB1-402", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT361", "08", "11:50 - 01:20", "ST", "AB1-402", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT350", "08", "11:50 - 01:20", "RA", "AB1-302", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT350", "09", "10:10 - 11:40", "ST", "AB1-502", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE115", "01", "08:30 - 10:00", "ST", "110", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE115", "02", "11:50 - 01:20", "MW", "108", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE231", "03", "11:50 - 01:20", "ST", "110", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE327", "04", "08:30 - 10:00", "MW", "630 (Software Engineering Lab)", "40"));
        
        courseDescriptionRepository.save(new CourseDescription("MAT120", "01", "11:50 - 01:20", "MW", "358", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT125", "10", "11:50 - 01:20", "RA", "AB2-204", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT130", "12", "03:10 - 04:40", "MW", "TBA", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT250", "02", "01:30 - 03:00", "ST", "359", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT350", "03", "11:50 - 01:20", "ST", "433", "40"));

        courseDescriptionRepository.save(new CourseDescription("MAT120", "01", "12:15–13:30", "ST", "SAC301", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT125", "02", "12:15–13:30", "RA", "SAC401", "40")); // Same section, different day
       courseDescriptionRepository.save(new CourseDescription("MAT350", "03", "11:50 - 01:20", "ST", "433", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT130", "12", "03:10 - 04:40", "MW", "TBA", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT250", "02", "01:30 - 03:00", "ST", "359", "40"));
        courseDescriptionRepository.save(new CourseDescription("MAT361", "08", "11:50 - 01:20", "ST", "AB1-402", "40"));

        // Updated Course Descriptions with New Schedule
        courseDescriptionRepository.save(new CourseDescription("CHE101", "02", "08:00–09:15", "ST", "SAC201", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE115", "01", "09:25–10:40", "MW", "SAC301", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE231", "02", "10:50–12:05", "RA", "NAC201", "40"));             courseDescriptionRepository.save(new CourseDescription("CSE109", "03", "12:15–13:30", "ST", "NAC401", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE332", "01", "13:40–14:55", "MW", "SAC401", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE327", "02", "13:40–14:55", "RA", "SAC301", "40")); // Duplicate section, different day
        courseDescriptionRepository.save(new CourseDescription("CSE373", "01", "15:05–16:20", "ST", "NAC201", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE422", "02", "16:30–17:45", "MW", "NAC615", "40"));

        courseDescriptionRepository.save(new CourseDescription("CSE231LAB", "01", "08:00–09:15", "RA", "SAC215", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE365LAB", "02", "09:25–10:40", "ST", "NAC301", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE365LAB", "01", "10:50–12:05", "MW", "NAC401", "40"));


        courseDescriptionRepository.save(new CourseDescription("CSE438LAB", "01", "08:00–09:15", "ST", "SAC201", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE332LAB", "02", "09:25–10:40", "MW", "SAC301", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE115LAB", "02", "10:50–12:05", "RA", "NAC201", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE231LAB", "01", "12:15–13:30", "ST", "NAC401", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE215LAB", "02", "13:40–14:55", "MW", "SAC401", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE331LAB", "01", "15:05–16:20", "RA", "SAC301", "40"));
        courseDescriptionRepository.save(new CourseDescription("CSE311LAB", "02", "16:30–17:45", "ST", "NAC601", "40"));


        //adding some demo students
        studentRepository.save(new Student("Jeremy", "G. Ingram", "JeremyGIngram@rhyta.com", "2016-1-60-100", 
    new ArrayList<CourseExtended>(Arrays.asList(
        new CourseExtended("ENG102", "08:00–09:15", "ST", "SAC201"),
        new CourseExtended("MAT350", "09:25–10:40", "MW", "SAC401"),
        new CourseExtended("CSE115", "10:50–12:05", "RA", "NAC201"),
        new CourseExtended("CHE101", "09:25–10:40", "RA", "NAC401"),
        new CourseExtended("CSE323", "10:50–12:05", "ST", "SAC301"),
        new CourseExtended("GEO201", "12:15–13:30", "MW", "NAC601"),
        new CourseExtended("MAT250", "16:30–17:45", "MW", "SAC315"),
        new CourseExtended("CSE440", "08:00–09:15", "RA", "SAC215"),
        new CourseExtended("CSE225", "09:25–10:40", "ST", "SAC301"),
        new CourseExtended("PHY108", "10:50–12:05", "MW", "NAC315"),
        new CourseExtended("CSE332", "12:15–13:30", "RA", "NAC601"),
        new CourseExtended("CSE231", "13:40–14:55", "ST", "NAC615"),
        new CourseExtended("CSE327", "15:05–16:20", "MW", "SAC201"),
        new CourseExtended("CSE301", "16:30–17:45", "RA", "SAC401"),
        new CourseExtended("CSE425", "08:00–09:15", "ST", "SAC201"),
        new CourseExtended("CSE445", "09:25–10:40", "MW", "NAC401")
    ))
));

// New Format for Course Extended Data
studentRepository.save(new Student("Erin", "D. Gaither", "ErinDGaither@teleworm.us", "2016-1-60-101",
    new ArrayList<CourseExtended>(Arrays.asList(
        new CourseExtended("ENG102", "08:00–09:15", "ST", "SAC201"),
        new CourseExtended("MAT116", "09:25–10:40", "MW", "SAC401"),
        new CourseExtended("CSE115", "10:50–12:05", "RA", "SAC201"),
        new CourseExtended("ENG102", "12:15–13:30", "ST", "SAC401"),
        new CourseExtended("MAT120", "13:40–14:55", "MW", "SAC201"),
        new CourseExtended("CSE101", "15:05–16:20", "RA", "SAC401"),
        new CourseExtended("PHY107", "16:30–17:45", "ST", "SAC201"),
        new CourseExtended("MAT130", "08:00–09:15", "MW", "NAC201"),
        new CourseExtended("CHE101", "09:25–10:40", "RA", "NAC401"),
        new CourseExtended("CSE215", "10:50–12:05", "ST", "NAC201")
    ))
));

        studentRepository.save(new Student("Minhazul", "Hayat Khan", "minhaz1217@gmail.com", "2016-1-60-102",
               new ArrayList<CourseExtended>(Arrays.asList(
        new CourseExtended("MAT120", "09:25–10:40", "MW", "SAC307"),
        new CourseExtended("ENG105", "10:50–12:05", "ST", "SAC211"),
        new CourseExtended("CSE311", "13:40–14:55", "RA", "NAC509")
    ))
                ))));
       studentRepository.save(new Student("John", "A. Davis", "JohnADavis@armyspy.com", "2016-1-60-103",
    new ArrayList<CourseExtended>(Arrays.asList(
        new CourseExtended("MAT125", "09:25–10:40", "MW", "SAC401"),
        new CourseExtended("ENG102", "10:50–12:05", "ST", "SAC201"),
        new CourseExtended("CSE311", "13:40–14:55", "RA", "NAC401")
    ))
));


        System.out.println("DB Details: " + " Users: " + userRepository.count() + " Courses: " + courseRepository.count() + " Course Description: " + courseDescriptionRepository.count() + " Students: " + studentRepository.count());
        return ("Details: " + " Users: " + userRepository.count() + " Courses: " + courseRepository.count() + " Course Description: " + courseDescriptionRepository.count() + " Students: " + studentRepository.count());

    }

    @Override
    public void run(String... args) throws Exception {

        //this.courseDescriptionRepository.save(new CourseDescription( "CSE405","1","08:30 - 10:00","MW", "112","40"));
        //showing some messages to verify that everything went ok
        System.out.println("DB Details: " + " Users: " + userRepository.count() + " Courses: " + courseRepository.count() + " Course Description: " + courseDescriptionRepository.count() + " Students: " + studentRepository.count());
        //System.out.println(courseRepository.count());

        System.out.println("DB LOADED SUCCESSFULLY");
    }

}
DbSeeder.java
32 KB
