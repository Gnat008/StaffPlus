package net.shortninja.staffplus.server.compatibility;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Set;

public interface IProtocol
{
    public final String NBT_IDENTIFIER = "StaffPlus";

    public ItemStack addNbtString(ItemStack item, String value);

    public String getNbtString(ItemStack item);

    public void registerCommand(String match, Command command);

    public void listVanish(Player player, boolean shouldEnable);

    public void sendHoverableJsonMessage(Set<Player> players, String message, String hoverMessage);

    public boolean shouldIgnorePacket(Object packetValue);
}