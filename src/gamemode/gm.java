package gamemode;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class gm implements CommandExecutor 
{










	public gm() {
		// TODO 自動生成されたコンストラクター・スタブ
	}








	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if("gm".equalsIgnoreCase(command.getName())){
        //ゲームモードコマンドの短縮
            if(sender instanceof Player){
                if(args.length == 1){
                    Player player = (Player)sender;
                    if(player.hasPermission("nuchiRPG.admin")){
                    //パーミッションの設定
                    	//plugin.ymlからでも設定は可plugin.ymlの方が簡単
                        switch (args[0]){
                            case "0":
                                player.setGameMode(GameMode.SURVIVAL);
                                player.sendMessage(ChatColor.RED+"ゲームモードをサバイバルに変更しました");
                                break;
                            case "1":
                                player.setGameMode(GameMode.CREATIVE);
                                player.sendMessage(ChatColor.RED+"ゲームモードをクリエイティブに変更しました");
                                break;
                            case "2":
                                player.setGameMode(GameMode.ADVENTURE);
                                player.sendMessage(ChatColor.RED+"ゲームモードをアドベンチャーに変更しました");
                                break;
                            case "3":
                                player.setGameMode(GameMode.SPECTATOR);
                                player.sendMessage(ChatColor.RED+"ゲームモードをスペクテイターに変更しました");
                                break;
                            default:
                                player.sendMessage(ChatColor.AQUA +"/gm <0/1/2/3>");
                                break;
                        }
                    }else{
                        player.sendMessage(ChatColor.RED +"あなたには権限がありません");
                        return true;
                    }
                }else{
                    sender.sendMessage(ChatColor.AQUA +"/gm <0/1/2/3>");
                    return true;
                }
                return true;
            }else{
                sender.sendMessage(ChatColor.RED+"プレーヤーから実行してください");
                return true;
            }
        }
        return false;
    }
}
