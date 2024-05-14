import datetime

class Student:
    def __init__(self, name, dob):
        self.name = name
        self.dob = dob

    def calculate_age(self):
        # Convert date of birth string to datetime object
        if "-" in self.dob:
            dob = datetime.datetime.strptime(self.dob, "%d-%m-%Y")
        else:
            dob = datetime.datetime.strptime(self.dob, "%Y-%m-%d")

        # Calculate age
        today = datetime.datetime.today()
        age = today.year - dob.year - ((today.month, today.day) < (dob.month, dob.day))
        return age

    def display_info(self):
        age = self.calculate_age()
        print(f"Student Name: {self.name}")
        print(f"Age: {age}")

class StudentCourses:
    def __init__(self, semester, courses):
        self.semester = semester
        self.courses = courses

    def display_courses(self):
        print(f"Semester: {self.semester}")
        for course, marks in self.courses.items():
            print(f"Course: {course}, Marks: {marks}")

# Create instances of Student and StudentCourses
student = Student("John Doe", "1998-05-15")
student_courses = StudentCourses("Spring 2023", {"Math": 90, "Science": 85, "History": 88})

# Display student information and courses
student.display_info()
student_courses.display_courses()
