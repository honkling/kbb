package agmas.kingsbutbad.commands;
import agmas.kingsbutbad.KingsButBad;
import agmas.kingsbutbad.utils.CreateText;
import agmas.kingsbutbad.utils.Role;
import agmas.kingsbutbad.utils.RoleManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.checker.units.qual.K;

public class KingCommand implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            if (KingsButBad.king == null) {
                KingsButBad.playerRoleInviteHashMap.clear();
                KingsButBad.king = p;
                KingsButBad.playerRoleHashMap.put(p, Role.KING);
                RoleManager.showKingMessages(p, Role.KING.objective);
                RoleManager.givePlayerRole(p);
                return true;
            } else {
                if (KingsButBad.king == p) {
                    if (args.length > 0) {
                        if (args[0].equals("knight")) {
                            if (args.length > 1) {
                                if (Bukkit.getPlayer(args[1]) != null) {
                                    Player pe = Bukkit.getPlayer(args[1]);
                                    if (KingsButBad.playerRoleHashMap.get(pe) == Role.PEASANT) {
                                        KingsButBad.playerRoleInviteHashMap.put(pe, Role.KNIGHT);
                                        pe.sendMessage(CreateText.addColors("<gradient:#FFFF52:#FFBA52><b>KING " + p.getName().toUpperCase() + "</b><blue> has invited you to being a <gray>knight! <red>use /accept to accept."));
                                    } else {
                                        p.sendMessage(CreateText.addColors("<gradient:#FFFF52:#FFBA52><b>KING " + p.getName().toUpperCase() + "</b><blue>, that player <red>isn't a peasant."));
                                    }
                                } else {
                                    p.sendMessage(CreateText.addColors("<gradient:#FFFF52:#FFBA52><b>KING " + p.getName().toUpperCase() + "</b><blue>, that player <red>does not exist."));
                                }
                            }
                        }
                        if (args[0].equals("help")) {
                            p.sendMessage(CreateText.addColors("<gray>----- <gradient:#FFFF52:#FFBA52>KING HELP <gray>-----"));
                            p.sendMessage(CreateText.addColors("<blue>Hello, <gradient:#FFFF52:#FFBA52><b>KING" + p.getName().toUpperCase() + "</b><blue>."));
                            p.sendMessage(CreateText.addColors("<blue>I'm the <gradient:#FFFF52:#FFBA52><b>ROYAL<blue> Villager.<blue> I help new kings get settled!"));
                            p.sendMessage(CreateText.addColors("<blue> Your goal is to <red>survive long<blue> and be <gold>powerful."));
                            p.sendMessage(CreateText.addColors("<red>To get started, I'd reccomend getting some <gradient:#0095ff:#1e00ff>Knights<red> to help you in <dark_red>combat."));
                            p.sendMessage(CreateText.addColors("<blue> Then, <gold>jail<blue> anyone that comes in your way. Only <dark_blue>Police<blue> and <gradient:#FFFF52:#FFBA52><b>KINGS<blue> can <gold>jail<blue>"));
                            p.sendMessage(CreateText.addColors("<blue> To jail someone, click their dead body (before they respawn) and select \"Send To Jail\"<blue>"));
                            p.sendMessage("");
                            p.sendMessage(CreateText.addColors("<gray>----- <gradient:#FFFF52:#FFBA52>KING'S COMMANDS <gray>-----"));
                            p.sendMessage(CreateText.addColors("<blue>/<gradient:#FFFF52:#FFBA52>king<blue> help <gray>- Shows this menu."));
                            p.sendMessage(CreateText.addColors("<gray>----- -----"));
                        }
                    }
                } else {
                    p.sendMessage(CreateText.addColors("<red>>> <dark_red>You're not the <gradient:#FFFF52:#FFBA52><b>king<b></gradient><dark_red>!"));
                }
            }
        }
        return true;
    }
}