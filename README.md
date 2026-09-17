# Experiment 7 – Adaptive UI Using ListView and ImageView

## Title

**Create an Adaptive UI Using ListView and ImageView in Android**

---

## Aim

To develop an Android application that demonstrates the use of **ListView** and **ImageView** to create an adaptive and user-friendly interface for displaying a list of items.

---

## Objective

The objectives of this experiment are:

- To understand the concept of `ListView` in Android.
- To understand the use of `ImageView` for displaying images.
- To create a custom layout for each ListView item.
- To use an Adapter to connect data with the ListView.
- To handle click events on ListView items.
- To design an adaptive UI that adjusts to different screen sizes.
- To display student information such as Name and USN.

---

## Technologies Used

- **Android Studio**
- **Kotlin**
- **XML**
- **Android SDK**
- **ListView**
- **ImageView**
- **ArrayAdapter**
- **Toast**

---

## Scenario

A college wants to develop a simple mobile interface where students can view a list of available courses.

Each course is displayed as a separate item containing:

- Course image
- Course name
- Course description

The application also displays the student's **Name and USN** at the top of the screen.

When the user selects a course from the ListView, a Toast message displays the selected course name.

---

# Application Features

### 1. Student Information

The application displays:

- Student Name
- Student USN

at the top of the screen.

### 2. Course List

A `ListView` is used to display multiple courses vertically.

### 3. Course Image

Each course item contains an `ImageView`.

### 4. Course Details

Each item displays:

- Course name
- Course description

### 5. Item Selection

When the user clicks on a course, a Toast message displays the selected course.

### 6. Adaptive Layout

The application uses:

- `match_parent`
- `wrap_content`
- `layout_weight`

to make the interface adaptable to different screen sizes.

---

# Application Flow

```text
             Start Application
                    |
                    v
          Display Student Details
             Name + USN
                    |
                    v
              Display ListView
                    |
                    v
       +------------+------------+
       |            |            |
       v            v            v
    Course 1     Course 2      Course 3
       |            |            |
       +------------+------------+
                    |
                    v
             User selects course
                    |
                    v
             Display Toast
          "Selected: Course Name"
PROJECT STRUCTURE
Experiment7
│
├── app
│   └── src
│       └── main
│           │
│           ├── java
│           │   └── com.example.experiment_7
│           │       ├── MainActivity.kt
│           │       └── CourseAdapter.kt
│           │
│           ├── res
│           │   └── layout
│           │       ├── activity_main.xml
│           │       └── list_item_course.xml
│           │
│           └── AndroidManifest.xml
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
How to Run the Application
Open the project in Android Studio.
Allow Gradle synchronization to complete.
Connect an Android device or start an Android Emulator.
Select the app configuration.
Click the Run ▶ button.
The application will be installed on the selected device.
Verify the course list.
Tap different courses to test the Toast messages.
Expected Output

After launching the application, the user should see a course list containing images, course names, and descriptions.

The student's Name and USN should be displayed at the top.

Selecting any course should display a Toast message containing the selected course name.

Result

The Android application was successfully developed to demonstrate an adaptive user interface using ListView and ImageView.

The application successfully displays student information and a list of courses with images and descriptions. ListView item selection is also handled using an Adapter and click listener.

Conclusion

This experiment demonstrates how ListView, ImageView, custom layouts, and Adapters can be combined to create a structured and adaptive Android user interface.

The experiment also provides an understanding of how data can be dynamically displayed in a ListView and how user interactions can be handled using click listeners.
