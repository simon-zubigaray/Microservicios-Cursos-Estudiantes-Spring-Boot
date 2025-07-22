package js.zubigaray.course.http.response;

import js.zubigaray.course.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentsByCourseResponse {
    private String courseName;
    private String teacher;
    private List<StudentDTO> studentDTOList;
}
