import Config.VideoGameConfig;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class VideoGamesRequestTypes extends VideoGameConfig {

    @Test
    public void getALLGames(){
        given()
                .log().all()
                .when().
                get("/videogame").
                //.get("https://videogamedb.uk/api/videogame")
                        then()
                .log().all();

    }



}
