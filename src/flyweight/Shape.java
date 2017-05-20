package flyweight;

import java.awt.Color;
import java.awt.Graphics;

public interface Shape
{
    public void draw(Graphics grp, int x, int y,
        int width, int height, Color color);
}
