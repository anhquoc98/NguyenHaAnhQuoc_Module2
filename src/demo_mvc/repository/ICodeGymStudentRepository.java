package interface_abstraction.repository;

import interface_abstraction.model.CodeGymStudent;

public interface ICodeGymStudentRepository {
    void display();
    void add(CodeGymStudent codeGymStudent);
    CodeGymStudent findById (int id);
    void update(CodeGymStudent codeGymStudent);
    // tự triển khai
    void remove(CodeGymStudent codeGymStudent);
    // Tìm kiếm gần đúng theo tên -> contain
}
