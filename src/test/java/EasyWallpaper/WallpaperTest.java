package EasyWallpaper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class WallpaperTest {

    private Wallpaper easyWallpaper;

    @Before
    public void setUp() {
        easyWallpaper = new Wallpaper();
    }

    @After
    public void tearDown() {
        easyWallpaper = null;
    }

    @Test
    public void test1() {
        assertEquals("ten", easyWallpaper.checkWallpaper(4, 3.5, 3));
    }

    @Test
    public void test2() {
        assertEquals("sixteen", easyWallpaper.checkWallpaper(6.3, 4.5, 3.29));
    }

    @Test
    public void test3() {
        assertEquals("seventeen", easyWallpaper.checkWallpaper(6.3, 5.8, 3.13));
    }

    @Test
    public void shouldReturnZero() {
        assertThat(easyWallpaper.checkWallpaper(0,5.8,3.13)).isEqualTo("zero");
    }

}