package sub;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class info implements CommandExecutor {




	public info() {
		// TODO 自動生成されたコンストラクター・スタブ
	}



	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if("nuchirpg".equalsIgnoreCase(command.getName())){
        //ゲームモードコマンドの短縮
            if(sender instanceof Player){
                if(args.length == 1){
                    Player player = (Player)sender;
                    if(player.hasPermission("nuchiRPG.admin")){
                    	 switch (args[0]){
                         case "info":
                             player.sendMessage(ChatColor.AQUA+"=====NuchiRPG info =====");
                             player.sendMessage(ChatColor.YELLOW+"プラグインバージョン: 0.0.2");
                             player.sendMessage(ChatColor.GREEN+"サーバーバージョン: 1.12.1");
                             player.sendMessage(ChatColor.GOLD+"=====コマンド一覧=====");
                             player.sendMessage(ChatColor.BLUE+"/gm <0/1/2/3>");
                             player.sendMessage(ChatColor.WHITE+"ゲームモード変更コマンド短縮");
                             player.sendMessage(ChatColor.DARK_AQUA+"/rpg info");
                             player.sendMessage(ChatColor.DARK_GRAY+"この画面が表示されます。");
                             break;
                         default:
                        	 player.sendMessage(ChatColor.AQUA+"=====NuchiRPG info =====");
                             player.sendMessage(ChatColor.YELLOW+"プラグインバージョン: 0.0.2");
                             player.sendMessage(ChatColor.GREEN+"サーバーバージョン: 1.12.1");
                             player.sendMessage(ChatColor.GOLD+"=====コマンド一覧=====");
                             player.sendMessage(ChatColor.BLUE+"/gm <0/1/2/3>");
                             player.sendMessage(ChatColor.WHITE+"ゲームモード変更コマンド短縮");
                             player.sendMessage(ChatColor.DARK_AQUA+"/rpg info");
                             player.sendMessage(ChatColor.DARK_GRAY+"この画面が表示されます。");
                             break;
                    	 }
                    }else{
                    	player.sendMessage(ChatColor.RED +"あなたには権限がありません");
                        return true;
                    }
                }else{
                	sender.sendMessage(ChatColor.AQUA+"=====NuchiRPG info =====");
                	sender.sendMessage(ChatColor.YELLOW+"プラグインバージョン: 0.0.2");
                	sender.sendMessage(ChatColor.GREEN+"サーバーバージョン: 1.12.1");
                	sender.sendMessage(ChatColor.GOLD+"=====コマンド一覧=====");
                	sender.sendMessage(ChatColor.BLUE+"/gm <0/1/2/3>");
                	sender.sendMessage(ChatColor.WHITE+"ゲームモード変更コマンド短縮");
                	sender.sendMessage(ChatColor.DARK_AQUA+"/rpg info");
                	sender.sendMessage(ChatColor.DARK_GRAY+"この画面が表示されます。");
                    return true;
                }
                return true;
                    }
        }else{
            sender.sendMessage(ChatColor.RED+"プレーヤーから実行してください");
            return true;

}
		return false;
	}
}
