package appeng.core.localization;

import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;

public final class DirectionNames {
    private DirectionNames() {}

    public static Component of(Direction side) {
        return switch (side) {
            case DOWN -> GuiText.DirectionDown.text();
            case UP -> GuiText.DirectionUp.text();
            case NORTH -> GuiText.DirectionNorth.text();
            case SOUTH -> GuiText.DirectionSouth.text();
            case WEST -> GuiText.DirectionWest.text();
            case EAST -> GuiText.DirectionEast.text();
        };
    }
}