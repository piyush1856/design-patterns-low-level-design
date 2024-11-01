from Student import Student

if __name__ == '__main__':

    student = (
        Student.get_builder()
            .set_id(1)
            .set_course("ACAD")
            .set_name("Piyush")
            .set_email("piyush@email.com")
            .build()
    )

    print(student)
