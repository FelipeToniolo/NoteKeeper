package com.felipetoniolo.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourse()
        initializeNotes()
    }

    private fun initializeCourse(){
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseID, course)

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses.set(course.courseID, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseID = "java_lang")
        courses.set(course.courseID, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseID, course)
    }

    private fun initializeNotes() {
        notes.add(NoteInfo(courses.get("android_intents")!!, "My Android Intents Note", "This is an android note."))
        notes.add(NoteInfo(courses.get("java_lang")!!, "My Java Note", "This is a note."))
        notes.add(NoteInfo(courses.get("java_core")!!, "Compiler options", "The java option isn't compatible with the cp option"))
        notes.add(NoteInfo(courses.get("android_async")!!, "Service default threads", "Did you know that by default an Android Service will tie up the UI thread?"))
        notes.add(NoteInfo(courses.get("java_lang")!!, "My Java Note", "This is a note."))
        notes.add(NoteInfo(courses.get("android_intents")!!, "My Android Intents Note", "This is an android note."))
        notes.add(NoteInfo(courses.get("java_lang")!!, "My Java Note", "This is a note."))
        notes.add(NoteInfo(courses.get("java_core")!!, "Compiler options", "The java option isn't compatible with the cp option"))
        notes.add(NoteInfo(courses.get("android_async")!!, "Service default threads", "Did you know that by default an Android Service will tie up the UI thread?"))
        notes.add(NoteInfo(courses.get("java_lang")!!, "My Java Note", "This is a note."))

    }

}