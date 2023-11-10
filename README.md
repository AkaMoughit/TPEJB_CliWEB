# TP EJB + Client Java + Client Web
Lorsqu'on intègre EJB avec un client web en Java, cela implique généralement la création d'une application web qui interagit avec les composants EJB déployés sur un serveur d'application.

EJB, ou Enterprise JavaBeans, est une technologie Java utilisée pour développer des composants d'entreprise modulaires et réutilisables. Lorsqu'elle est combinée avec un client web et déployée sur WildFly, un serveur d'applications Java open source, elle offre une architecture robuste pour la construction d'applications d'entreprise.

Les EJB sont des composants serveur qui encapsulent la logique métier de l'application. Ils fournissent des fonctionnalités telles que la gestion des transactions, la persistance des données et l'injection de dépendances, ce qui simplifie le développement d'applications d'entreprise.

Lorsqu'un client web, généralement une application frontale ou une interface utilisateur, interagit avec des EJB sur WildFly, il utilise des mécanismes tels que RMI (Remote Method Invocation) pour appeler les méthodes exposées par les EJB. Les EJB peuvent être déployés sur le serveur WildFly, qui gère la gestion du cycle de vie, la sécurité et d'autres aspects liés à l'exécution des EJB.

En utilisant WildFly comme serveur d'applications, les développeurs peuvent bénéficier de fonctionnalités avancées telles que la gestion des ressources, la scalabilité, la haute disponibilité, et la gestion des transactions distribuées, offrant ainsi un environnement fiable pour les applications d'entreprise.

En résumé, l'utilisation d'EJB avec un client web et WildFly offre une architecture puissante et évolutive pour le développement d'applications d'entreprise Java, facilitant la création de composants réutilisables et la gestion efficace des aspects liés à l'entreprise.

## ## EJB SERVER PROJECT 
On ajout une interface IDao local

![image](https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/cc6a49d2-9d2d-4d5d-bbda-d334e69d77e3)
<br>
![image](https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/daf1233b-5f67-4833-9005-ea11bc35d8ed)

### EJB WEB Dynamique APP
On cree un projet web dynamique

![image](https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/f7b7379a-e568-4e58-8f33-60f69af9d1df)

fichier index.jsp

![image](https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/112e6b5c-53e8-4eb5-9d84-0fea6d83705c)

fichier controller extends de HttpServlet

![image](https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/68886d20-9812-4974-9e0e-6252a2a2e551)

### EAR PROJECT

![image](https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/6230e2d1-2b61-4b5a-846f-a00803d7ef30)

EAR, ou Enterprise Archive, est un format de fichier standard dans le monde Java, utilisé pour regrouper et déployer des applications d'entreprise. Un fichier EAR peut contenir plusieurs modules, notamment des fichiers JAR (Java Archive), des fichiers WAR (Web Archive) et des fichiers EJB-JAR (Enterprise JavaBeans Archive), parmi d'autres.

Le format EAR est souvent utilisé pour encapsuler des applications d'entreprise complètes, permettant ainsi de déployer et de gérer l'ensemble de l'application en une seule archive. Cela simplifie le déploiement et la maintenance des applications complexes, car tous les modules nécessaires à l'application peuvent être regroupés dans un seul fichier.

Typiquement, un fichier EAR contient des composants tels que des Servlets (dans des fichiers WAR), des EJB (dans des fichiers EJB-JAR), des bibliothèques partagées (dans des fichiers JAR) et d'autres ressources nécessaires à l'application.

Lorsqu'une application EAR est déployée sur un serveur d'applications Java EE, comme WildFly, le serveur est capable de reconnaître et de gérer les différents types de modules contenus dans l'archive, facilitant ainsi la mise en service de l'application.

En résumé, le format EAR est utilisé pour regrouper et déployer des applications d'entreprise Java, simplifiant le processus de déploiement et de gestion en regroupant tous les composants nécessaires dans une seule archive.


# EXECUTION 

### video

https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/f3cd96ff-b09f-42b9-abef-790aae0df4f7

### screenshots

![image](https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/88c89c11-bb0d-4f99-8a7f-d271781db483)

![image](https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/1d5068d2-6500-40cf-9db5-83a53ed6407c)

![image](https://github.com/AkaMoughit/TPEJB_CliWEB/assets/73391568/65cc591b-8705-403f-9024-05480a28e58a)
