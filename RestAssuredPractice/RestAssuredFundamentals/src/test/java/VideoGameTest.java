
import Config.VideoGameConfig;
import Config.VideoGameEndpoints;
import com.github.fge.jsonschema.core.processing.ProcessorSelectorPredicate;
import com.github.fge.jsonschema.core.report.MessageProvider;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static java.lang.reflect.Array.get;

public class VideoGameTest extends VideoGameConfig {

    @Test
    public void myVideoTest
            () {
        given()
                .log().all()
                .when().
                get("/videogame").
                //.get("https://videogamedb.uk/api/videogame")
                        then()
                .log().all();
    }

    @Test
    public void TestwithEndpoints() {
        given()
               .log().all()
               .when().
        get(VideoGameEndpoints.ALL_VIDEO_GAMES)
        .then()
                .log().all();

    }
}




