# BackEconomy

[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.20.x-green?style=for-the-badge)](https://minecraft.net) 
[![Java Version](https://img.shields.io/badge/Java-21-blue?style=for-the-badge)](https://www.java.com/en/) 
[![Build Status](https://img.shields.io/github/actions/workflow/status/Kukur091/BackEconomy/maven.yml?branch=main&style=for-the-badge)](https://github.com/Kukur091/BackEconomy/actions)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)


## 🎉 Overview

BackEconomy is a lightweight **Minecraft Spigot plugin** that allows players to **buy a teleportation to their last death position** after death using the in-game economy.  
Seamlessly integrates with Vault and popular economy plugins for a smooth, hassle-free experience.


## 🚀 Features

- Buy a teleportation to their last death position with configurable pricing  
- Fully configurable messages 
- Supports Vault for economy integration    
- Compatible with Minecraft 1.21.x and above


## ⚙️ Installation

1. Download the latest `.jar` from the [Releases](https://github.com/Kukur091/BackEconomy/releases) page.  
2. Place the `.jar` file into your server’s `plugins` folder.  
3. Restart your server or reload plugins.  
4. Configure `config.yml` to your liking.  
5. Ensure Vault and an economy plugin (e.g., EssentialsX, iConomy) are installed.  


## 📋 Configuration Example

```yaml
price: 100
success-message: 'Vous êtes revenu au lieu de votre denière mort contre 100$'
error-message: "/back impossible, pas assez d'argent ou pas de mort detecté"
```


## 💻 Usage

- Players can use `/back` to purchase a teleportation to the last death position.  
- Permissions:  
  - `fr.kukur.back` — Use the back command  



## 🛠️ Developer Info

- Developed by **Kukur091**  
- Plugin built with Maven and targets Java 21+  
- Uses Vault API for economy interactions  


## 🙏 Credits

Special thanks to the creators of [Vault](https://dev.bukkit.org/projects/vault), [EssentialsX](https://essentialsx.net/), and the open-source Minecraft community.



## 📄 License

This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.



## 📬 Contact / Support

Feel free to open issues or pull requests on GitHub:  
[https://github.com/Kukur091/BackEconomy](https://github.com/Kukur091/BackEconomy)



## 🔗 Useful Links

| Resource             | Link                                              |
|----------------------|---------------------------------------------------|
| Vault Plugin         | https://dev.bukkit.org/projects/vault             |
| EssentialsX Plugin   | https://essentialsx.net/                           |
| SpigotMC Developer Hub | https://www.spigotmc.org/wiki/spigot-plugin-development/ |



## 📊 Stats (optional)

![GitHub repo size](https://img.shields.io/github/repo-size/Kukur091/BackEconomy?style=flat-square)
![GitHub issues](https://img.shields.io/github/issues/Kukur091/BackEconomy?style=flat-square)
![GitHub forks](https://img.shields.io/github/forks/Kukur091/BackEconomy?style=flat-square)
![GitHub stars](https://img.shields.io/github/stars/Kukur091/BackEconomy?style=flat-square)



## 🌟 Support the Project

If you like this plugin, consider starring ⭐ the repo or supporting via GitHub Sponsors.



Thanks for checking out **BackEconomy**!  
