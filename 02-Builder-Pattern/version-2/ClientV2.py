from StudentV2 import StudentV2

if __name__ == '__main__':
    student = (
        StudentV2.builder()
            .roll(1)
            .s_name("Piyush")
            .section("A")
            .build()
    )

    print(student)