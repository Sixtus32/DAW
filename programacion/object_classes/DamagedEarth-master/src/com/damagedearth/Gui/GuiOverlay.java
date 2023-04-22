/*******************************************************************************
 * This is a free program developed and managed by The Predators Development Team. This
 * source code should have a copy of the GNU General Public License. If it does not,
 * please see <http://www.gnu.org/licenses/>. The Predators Development Team forums is
 * located at <http://thepredators.endofinternet.net/index.php>.
 ******************************************************************************/

package com.damagedearth.Gui;

import com.damagedearth.DamagedEarth;
import com.damagedearth.Worlds.AbstractWorld;

/**
 * The gui for displaying health, level, energy, etc.
 */
public class GuiOverlay
{
    private DamagedEarth damagedEarth;

    private String health;

    public GuiOverlay(DamagedEarth damagedEarth)
    {
        this.damagedEarth = damagedEarth;
    }

    public void update()
    {
        if (damagedEarth.currentWorld != null)
        {
            this.calculate();
            this.draw();
        }
    }

    public void draw()
    {
        DamagedEarth.fontRenderer.drawString(this.health, AbstractWorld.VIEW_CORDS_X + 2, AbstractWorld.VIEW_CORDS_Y + damagedEarth.height - 26);
    }

    public void calculate()
    {
        this.health = String.format("Health: %s", damagedEarth.currentWorld.thePlayer.getHealth() >= 0 ? damagedEarth.currentWorld.thePlayer.getHealth() : 0);
    }
}
