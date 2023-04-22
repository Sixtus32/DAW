/*******************************************************************************
 * This is a free program developed and managed by The Predators Development Team. This
 * source code should have a copy of the GNU General Public License. If it does not,
 * please see <http://www.gnu.org/licenses/>. The Predators Development Team forums is
 * located at <http://thepredators.endofinternet.net/index.php>.
 ******************************************************************************/

package com.damagedearth.Utilities;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL12;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;

import static org.lwjgl.opengl.GL11.*;

public class Tesselator
{
    //TODO: Make a paragraph draw method. We could use it for drawing the lore of quests inside NPC Gui's

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private float r = 255;
    private float g = 255;
    private float b = 255;
    private float a = 255;

    private int id;

    public void set(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void setColor(float r, float g, float b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void setAlpha(float a)
    {
        this.a = a;
    }

    public void setColor(float r, float g, float b, float a)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    /*
    This method is for drawing quads with color
     */
    public void drawQuad()
    {
        glPushAttrib(GL_CURRENT_BIT);
        glColor4f(r, g, b, a);

        //Follow this format for OpenGL texture drawing
        glBegin(GL_QUADS);
        {
            glVertex2d(x1, y1);
            glVertex2d(x1, y2);
            glVertex2d(x2, y2);
            glVertex2d(x2, y1);
        }

        glEnd();
        glPopAttrib();
    }

    /**
     * This method is for rendering images onto the screen.
     *
     * @param image The image to render
     */
    public void drawTextQuad(BufferedImage image)
    {
        glEnable(GL_TEXTURE_2D);
        glEnable(GL_BLEND);

        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA); //ACT AS THOUGH YOUR LIFE DEPENDS ON THIS LINE!

        id = TextureLoader.loadTexture(image);

        //Follow this format for OpenGL texture drawing
        glBegin(GL_QUADS);
        {
            glTexCoord2d(0, 0);
            glVertex2d(x1, y1);
            glTexCoord2d(1, 0);
            glVertex2d(x2, y1);
            glTexCoord2d(1, 1);
            glVertex2d(x2, y2);
            glTexCoord2d(0, 1);
            glVertex2d(x1, y2);
        }

        glEnd();

        glDisable(GL_TEXTURE_2D);
        glDisable(GL_BLEND);
        glDeleteTextures(id);
    }

    private static class TextureLoader
    {
        private static final int BYTES_PER_PIXEL = 4;

        public static int loadTexture(BufferedImage image)
        {

            int[] pixels = new int[image.getWidth() * image.getHeight()];
            image.getRGB(0, 0, image.getWidth(), image.getHeight(), pixels, 0, image.getWidth());

            ByteBuffer buffer = BufferUtils.createByteBuffer(image.getWidth() * image.getHeight() * BYTES_PER_PIXEL);

            for (int y = 0; y < image.getHeight(); y++)
            {
                for (int x = 0; x < image.getWidth(); x++)
                {

                    int index = pixels[y * image.getWidth() + x];

                    byte v1 = (byte) ((index >> 16) & 0xFF);
                    byte v2 = (byte) ((index >> 8) & 0xFF);
                    byte v3 = (byte) (index & 0xFF);
                    byte v4 = (byte) ((index >> 24) & 0xFF);

                    buffer.put(v1);
                    buffer.put(v2);
                    buffer.put(v3);
                    buffer.put(v4);
                }
            }

            buffer.flip(); //FOR THE LOVE OF GOD DO NOT FORGET THIS

            int textureID = glGenTextures(); //Generate texture ID
            glBindTexture(GL_TEXTURE_2D, textureID); //Bind texture ID

            //Setup wrap mode
            glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
            glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);

            //Setup texture scaling filtering
            glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
            glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);

            //Send texel data to OpenGL
            glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA8, image.getWidth(), image.getHeight(), 0, GL_RGBA, GL_UNSIGNED_BYTE, buffer);

            //Return the texture ID so we can bind it later again
            return textureID;
        }
    }
}
