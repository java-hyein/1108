package board03;
//테이블의 데이터를 담거나 사용자의 데이터를 담을 Value Object 객체
//VO => Value Object
//Data Transfer Object(DTO)라고도 부를 수 있음
import java.sql.Date;

public class BoardVO {
    private int id;
    private String title;
    private String content;
    private Date writtenDate;
    private Date updatedDate;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public Date getWrittenDate() {
        return writtenDate;
    }
    
    public void setWrittenDate(Date writtenDate) {
        this.writtenDate = writtenDate;
    }
    
    public Date getUpdatedDate() {
        return updatedDate;
    }
    
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
 
    public String toString() {
    	return id + "\t" + title + "\t" + writtenDate;
    }
      
}