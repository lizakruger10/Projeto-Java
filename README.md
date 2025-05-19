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

![image](https://github.com/user-attachments/assets/13b425d0-3c34-4848-a247-f1649cd0c61b)



  •	MusicaDao: Manipula registros relacionados a músicas no banco de dados, como a busca por músicas, curtidas e descurtidas.  
  •	PlaylistDAO: Registros com playlists no banco de dados. Cria, editar e excluir.  
  •	UsuarioDAO: Operações com usuários no banco de dados.  

2.	Controller -  
  •	ControllerCadastro: Registra novos usuários chamando o UsuarioDAO.  
  •	ControllerLogin: Realiza a autenticidade do usuário através do UsuarioDAO.  
  •	ControllerMusica: Busca músicas por nome, gênero ou artista e controla as curtidas e descurtidas de cada música.  
  •	ControllerPlaylist: Gerencia playlists, criar, editar e excluir usando o PlaylistDAO.

3.	Model – Define a estrutura das músicas  
  •	Musica.java: Atributos de uma música e gets e sets.  
Atributos: id, nome, artista, gênero, anoLancamento, curtiu e descurtiu.  
  •	Playlist.java: Atributos de uma playlist e gets e sets.  
Atributos: id, nome e lista de músicas.  
  •	Usuario.java: Atributos de um usuário e métodos de acesso.
Atributos: Nome, usuário e senha  

   
4.	Projeto - Classe main que inicia o programa com a tela TelaInicialFrame.  

5.	View – Interface gráfica  

•	TelaInicialFrame: Tela inicial com os botões de cadastro e de login.  
   ![image](https://github.com/user-attachments/assets/db19d2f8-e0d6-40c0-a1da-a65b452a735f)  

•	CadastroFrame: Janela para cadastro do usuário.   
![image](https://github.com/user-attachments/assets/c3f7b85d-9de9-4f88-959b-9a8980fbc35b)  

•	LoginFrame: Tela de login do usuário.  
![image](https://github.com/user-attachments/assets/d9bbac98-5e0f-4d43-9ae7-386a2efb421b)  

•	TelaPrincipalFrame: Menu principal do usuário logado.   
![image](https://github.com/user-attachments/assets/74ea8b18-67e8-4719-a40f-caa91d830e7e)  

•	BuscarMusicasFrame: Tela com o campo para buscar músicas, curtir e descurtir.   
![image](https://github.com/user-attachments/assets/3d658a7e-1130-4b87-b6ee-638d172c68ce)  

•	PlaylistFrame: Tela para gerenciar playlists, criar, editar ou excluir playlists.  
![image](https://github.com/user-attachments/assets/d5b32929-da2e-4bb9-a466-adbdcf3fe5fb)  

 
