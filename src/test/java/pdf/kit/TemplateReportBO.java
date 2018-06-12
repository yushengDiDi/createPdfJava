package pdf.kit;

import lombok.Data;

import java.util.List;

/**
 * @auther ly
 * @date 2017/12/14 17:58
 */
@Data
public class TemplateReportBO {

    private String name;

    private String age;

    private List<String> scores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getScores() {
        return scores;
    }

    public void setScores(List<String> scores) {
        this.scores = scores;
    }
}
