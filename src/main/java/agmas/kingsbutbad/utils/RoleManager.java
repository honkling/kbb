package agmas.kingsbutbad.utils;

import agmas.kingsbutbad.KingsButBad;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

import static net.kyori.adventure.text.minimessage.MiniMessage.miniMessage;


public class RoleManager {

    public static void showKingMessages(Player p, String reason) {
        p.sendTitle(ChatColor.GREEN + "YOU ARE " + LegacyComponentSerializer.legacySection().serialize(miniMessage().deserialize("<gradient:#FFFF52:#FFBA52><b>THE KING!<b></gradient>")), reason);
        p.sendMessage(miniMessage().deserialize("<green><b>You're </green><gradient:#FFFF52:#FFBA52><b>The king!<b></gradient><#AEAEAE> Read <red><b>/ᴋɪɴɢ ʜᴇʟᴘ</b></red><#AEAEAE> for a small tutorial!<reset>"));
    }
    public static void givePlayerRole(Player p) {
        KingsButBad.playerRoleHashMap.putIfAbsent(p, Role.PEASANT);
        p.getInventory().clear();
        if (p == KingsButBad.king) {
            ItemStack crown = new ItemStack(Material.GOLDEN_HELMET);
            ItemMeta crownmeta = crown.getItemMeta();
            crownmeta.setUnbreakable(true);
            crownmeta.setDisplayName(CreateText.addColors("<color:#ffff00><b>King's <gradient:#ff4046:#ffff00>Crown</b></color>"));
            ArrayList<String> crownlore = new ArrayList<>();
            crownlore.add(ChatColor.GRAY + "A crown worn by mighty kings while ruling their kingdom.");
            crownlore.add(ChatColor.GRAY + "");
            crownlore.add(CreateText.addColors("<color:#ff0400><i><b>Drop <gradient:#ffdd00:#ffff6e>this<color:#ff2f00> to <color:#910005>Resign.</color> </b></i></color>"));
            crownmeta.setLore(crownlore);
            crownmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
            crownmeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
            crown.setItemMeta(crownmeta);
            p.getInventory().setHelmet(crown);
            ItemStack diamondchest = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemMeta diamondchestmeta = diamondchest.getItemMeta();
            diamondchestmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            diamondchestmeta.setUnbreakable(true);
            diamondchest.setItemMeta(diamondchestmeta);
            p.getInventory().setChestplate(diamondchest);
            diamondchest = new ItemStack(Material.DIAMOND_LEGGINGS);
            diamondchestmeta = diamondchest.getItemMeta();
            diamondchestmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            diamondchestmeta.setUnbreakable(true);
            diamondchest.setItemMeta(diamondchestmeta);
            p.getInventory().setLeggings(diamondchest);
            diamondchest = new ItemStack(Material.DIAMOND_BOOTS);
            diamondchestmeta = diamondchest.getItemMeta();
            diamondchestmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            diamondchestmeta.setUnbreakable(true);
            diamondchest.setItemMeta(diamondchestmeta);
            p.getInventory().setBoots(diamondchest);
            ItemStack blade = new ItemStack(Material.DIAMOND_SWORD);
            ItemMeta blademeta = blade.getItemMeta();
            blademeta.setUnbreakable(true);
            blademeta.setDisplayName(CreateText.addColors("<color:#ffff00><b>King's <gradient:#0095ff:#1e00ff>Blade</b></color>"));
            ArrayList<String> bladelore = new ArrayList<>();
            bladelore.add(ChatColor.GRAY + "The blade yielded by kings of the past; does loads of damage.");
            blademeta.setLore(bladelore);
            blademeta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
            blademeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
            blade.setItemMeta(blademeta);
            p.getInventory().addItem(blade);
            return;
        }
        if (KingsButBad.playerRoleHashMap.get(p) == Role.KNIGHT) {
            ItemStack diamondchest = new ItemStack(Material.IRON_CHESTPLATE);
            ItemMeta diamondchestmeta = diamondchest.getItemMeta();
            diamondchestmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
            diamondchestmeta.setUnbreakable(true);
            diamondchest.setItemMeta(diamondchestmeta);
            p.getInventory().setChestplate(diamondchest);
            diamondchest = new ItemStack(Material.IRON_HELMET);
            diamondchestmeta = diamondchest.getItemMeta();
            diamondchestmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
            diamondchestmeta.setUnbreakable(true);
            diamondchest.setItemMeta(diamondchestmeta);
            p.getInventory().setHelmet(diamondchest);
            diamondchest = new ItemStack(Material.IRON_LEGGINGS);
            diamondchestmeta = diamondchest.getItemMeta();
            diamondchestmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
            diamondchestmeta.setUnbreakable(true);
            diamondchest.setItemMeta(diamondchestmeta);
            p.getInventory().setLeggings(diamondchest);
            diamondchest = new ItemStack(Material.IRON_BOOTS);
            diamondchestmeta = diamondchest.getItemMeta();
            diamondchestmeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
            diamondchestmeta.setUnbreakable(true);
            diamondchest.setItemMeta(diamondchestmeta);
            p.getInventory().setBoots(diamondchest);
            ItemStack blade = new ItemStack(Material.IRON_SWORD);
            ItemMeta blademeta = blade.getItemMeta();
            blademeta.setUnbreakable(true);
            blademeta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
            blademeta.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_UNBREAKABLE);
            blade.setItemMeta(blademeta);
            p.getInventory().addItem(blade);
        }
        p.sendTitle(KingsButBad.playerRoleHashMap.get(p).tag, KingsButBad.playerRoleHashMap.get(p).objective);
    }
}