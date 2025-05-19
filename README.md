# Projeto-Java
## Introdução
Este projeto consiste em criar um código em java para simular uma plataforma de áudios digitais, como músicas ou podcasts. Algumas das tecnologias usadas foram: MVC (Model, View, Controller) e o JDBC PostgreSQL.  
**As funcionalidades do código são:**  
•	Cadastrar novo usuário;   
•	Login de usuário;  
•	Buscar músicas por nome, gênero ou artista;  
•	Informações sobre as músicas  
•	Curtir e descurtir músicas  
•	Criar, editar e excluir playlists  

## Desenvolvimento
Para melhor organização, foi utilizado o modelo MVC (Model, View e Controller).  
Pastas:  
1.	DAO – Acesso a dados no PG Admin  
•	Conexão: Gerencia a conexão com o banco de dados  
•	MusicaDao: Manipula registros relacionados a músicas no banco de dados, como a busca por músicas, curtidas e descurtidas.  
•	PlaylistDAO: Registros com playlists no banco de dados. Cria, editar e excluir.  
•	UsuarioDAO: Operações com usuários no banco de dados.  

2.	Controller -  
•	ControllerCadastro: Registra novos usuários chamando o UsuarioDAO.  
•	ControllerLogin: Realiza a autenticidade do usuário através do UsuarioDAO.  
•	ControllerMusica: Busca músicas por nome, gênero ou artista e controla as curtidas e descurtidas de cada música.  
•	ControllerPlaylist: Gerencia playlists, criar, editar e excluir usando o PlaylistDAO.  
3.	Model  
4.	Projeto  
5.	View  
