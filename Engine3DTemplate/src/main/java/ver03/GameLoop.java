package ver03;

import org.lwjgl.glfw.GLFW;
import ver03.engine.Input;
import ver03.engine.Window;

public class GameLoop {
    private Window window;
    private static final int WIDTH = 1280, HEIGHT = 760;

    public void start() {

    }

    private void init() {
        window = new Window(HEIGHT, WIDTH, "Game");
        window.create();
    }

    private void update() {
        window.update();
        if (Input.isButtonDown(GLFW.GLFW_MOUSE_BUTTON_LEFT)) System.out.println("X: " + Input.getMouseX() + ", Y: " + Input.getMouseY());
    }

    private void render() {
        window.swapBuffers();
    }

    public void run() {
        init();
        while (!window.shouldClose()) {
            update();
            render();
            if (Input.isKeyDown(GLFW.GLFW_KEY_ESCAPE)) return;
        }
        window.destroy();
    }
}
