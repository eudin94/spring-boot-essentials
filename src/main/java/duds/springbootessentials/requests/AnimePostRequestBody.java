package duds.springbootessentials.requests;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "The anime name cannot be empty")
//    @NotNull(message = "The anime name cannot be null") EMPTY WORKS FOR NULL
    private String name;
}
