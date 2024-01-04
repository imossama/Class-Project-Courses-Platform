# Projet de classe : Plateforme des cours
<br>
<img src="https://i.ibb.co/RYSbYPK/SiteLogo.png" alt="E-Cours ESTSB" border="0" width="200">
Le projet de classe 'E-Cours' est un utilitaire web complet conçu pour autonomiser les enseignants à l'EST SB en fournissant une plateforme centralisée pour accéder à, partager et gérer les cours. Cette plateforme permet aux éducateurs et aux étudiants de communiquer et de collaborer en temps réel à travers plusieurs leçons. Nous travaillons sur cette application en équipe de 6 personnes, comme notre encadrant l'a demandé.

<div align="center">
<h4>Membre du groupe</h4>
<h6>
<table width="600">
  <tr>
    <th>Nom complet</th>
    <th>Tâche affectée</th>
  </tr>
  <tr>
    <td>ETTAQAFI OSSAMA<br>TOURTIT Aziza<br>DAROUICH Najwa</td>
    <td><code>Front-End</code></td>
  </tr>
  <tr>
    <td>EZZAHRI Yahia<br>FADLI Mohammed<br>ELOUAZZANI Fatima Zahra</td>
    <td><code>Back-End</code></td>
  </tr>
</table>
</h6>
</div>
<div align="center">
<h4>Plateforme de Collaboration</h4>
<p>Nous avons utilisé la plateforme Trello pour faciliter la communication, la coordination et le travail d'équipe dans notre projet. Vous pouvez consulter notre avancement en cliquant sur l'image ou <a href="https://trello.com/w/classprojectcoursesplatform">en cliquant ici</a>.</p>
<a href="https://trello.com/w/classprojectcoursesplatform" target="_blank">
  <img src="https://upload.wikimedia.org/wikipedia/en/thumb/8/8c/Trello_logo.svg/2560px-Trello_logo.svg.png" width="100" target="_blank"/>
</a>
</div>

## Table des matières
1. [Introduction](#intro)
2. [Présentation du Projet](#pres)
3. [Contexte](#con)
4. [Besoin du client](#bc)
5. [Portée du projet](#pp)
6. [Contraintes](#contr)
7. [Critères d'acceptation](#ctrac)
8. [Livrables](#livr)
9. [Planning](#plan)
10. [Ressources](#ress)
11. [Communication](#comm)
12. [Gestion des Risques](#gr)
13. [Conditions Contractuelles](#conc)
14. [Validation](#val)

## 1. Introduction <a name="intro"></a>

#### 📋 Objectif du Document
Ce document a pour objectif de définir les exigences et les spécifications fonctionnelles de notre application scolaire de gestion de cours.

#### 🌐 Contexte du Projet
L'application vise à faciliter le processus de planification, de gestion et de suivi des cours dans un environnement scolaire.

#### 👥 Parties Prenantes et Leurs Rôles
- **👩‍💼 Administrateur**: Gestionnaire global de l'application, responsable de l'ajout d'utilisateurs, de la configuration générale, et de la supervision du système.
- **👨‍🏫 Professeur**: Utilisateur chargé de créer et de gérer les cours (TPs, TDs), de les modifier et de les supprimer.
- **👨‍🎓 Étudiant**: Utilisateur inscrit à des cours, permettant de consulter les cours.

## 2. Présentation du Projet <a name="pres"></a>

#### 📝 Description Générale du Projet
L'application vise à simplifier la gestion des cours en fournissant une plateforme centralisée pour l’administrateur, les professeurs et les étudiants.

#### 🎯 Buts et Objectifs
- Faciliter la planification et la gestion des cours pour les professeurs.
- Permettre aux étudiants de consulter les cours et les informations associées.

## 3. Contexte <a name="con"></a>

#### 🌍 Environnement dans lequel le Projet Sera Mis en Œuvre
- L'application sera déployée dans un environnement scolaire, accessible via une plateforme web.
- Elle devra s'intégrer aux systèmes existants de gestion des étudiants et des cours.
- L'application doit être compatible avec les navigateurs web couramment utilisés (Google Chrome, Mozilla Firefox, Safari, etc.) pour assurer une accessibilité optimale.
- Une version mobile doit être disponible pour permettre un accès facile depuis des appareils mobiles.

#### 🤝 Contraintes et Dépendances avec d'Autres Projets ou Systèmes
- L'intégration avec le système de gestion des étudiants actuel sera essentielle pour une utilisation harmonieuse de l'application.
- Le système doit être compatible avec les normes de sécurité informatique de l'institution scolaire, y compris la gestion des accès et la protection des données personnelles.
- La collaboration avec le département informatique de l'établissement est nécessaire pour garantir une infrastructure technique adéquate et un support technique continu.
- Les mises à jour et les évolutions du système devront être coordonnées avec le calendrier académique pour minimiser les interruptions.

## 4. Besoin du client <a name="bc"></a>

#### Exigences fonctionnelles

###### 📘 Gestion des Cours
Permettre aux professeurs de créer, modifier, supprimer des cours.

###### 🛠️ Gestion des Utilisateurs
Autoriser l'administrateur à ajouter/supprimer des utilisateurs, attribuer des rôles et gérer les accès.

###### 🔍 Consultation des Cours
Offrir aux étudiants un accès facile pour consulter les cours, télécharger des ressources, et accéder aux informations relatives aux cours.

#### Exigences non fonctionnelles

###### 🚀 Performances
Assurer une réactivité optimale de l'application même lors d'une charge importante (nombre élevé d'utilisateurs simultanés).

###### 🔒 Sécurité
Implémenter des mesures de sécurité robustes pour protéger les données des étudiants et assurer l'intégrité du système.

###### 🎨 Convivialité
Garantir une interface utilisateur intuitive pour faciliter l'interaction avec l'application, aussi bien sur web que sur mobile.

###### 🔄 Compatibilité
Veiller à ce que l'application soit compatible avec les navigateurs populaires (Chrome, Firefox, Safari) et disponible sur les appareils mobiles pour une accessibilité maximale.

## 5. Portée du projet <a name="pp"></a>

#### 🌐 Inclus
Développement de l'application scolaire de gestion de cours selon les spécifications fonctionnelles établies.

#### 🚫 Exclus
Les cours en eux-mêmes (leur contenu spécifique) ne seront pas créés par l'application, mais par les professeurs eux-mêmes.

## 6. Contraintes <a name="contr"></a>

1. Contrainte de temps:
   - L'application doit être complétée dans un mois.

2. Contrainte de budget:
   - Budget est 0DH.

3. Contraintes de ressources:
   - L'équipe de développement : L'équipe est composée de 6 membres.
   - Équipement : Des ordinateurs personnels.

## 7. Critères d'acceptation <a name="ctrac"></a>

#### 🎉 Conditions de réussite:
- L'étudiant peut se connecter à son compte.
- Consulter les cours.
- 
# 8. Livrables <a name="livr"></a>
#### Application Web Fonctionnelle:
- Interface utilisateur intuitive.
- Système de gestion des cours pour les professeurs.
- Fonctionnalités de consultation des cours pour les étudiants.
- Fonctionnalités d'administration pour l’administrateur.

#### Applications Mobiles (si applicable) 📱:
- Applications iOS et Android offrant une expérience similaire à la version web.
- Fonctionnalités adaptées aux écrans mobiles.

#### Documentation Technique 📚:
- Document d'architecture logicielle décrivant la structure de l'application.
- Spécifications techniques détaillées pour les développeurs.
- Procédures d'installation et de configuration.

#### Manuels d'Utilisateur 📖:
- Manuel de l'administrateur expliquant la gestion globale de l'application.
- Guide du professeur détaillant la création et la gestion des cours.
- Guide de l'étudiant expliquant la consultation des cours.

## 9. Planning <a name="plan"></a>
#### Échéancier du Projet avec des Jalons Clés:
- **Phase 1**: Analyse des Besoins (une semaine)
  - Jalon 1: Fin des Entrevues avec les Parties Prenantes.
  - Jalon 2: Validation des Besoins.
- **Phase 2**: Conception (une semaine)
  - Jalon 3: Fin de la Conception de l'Architecture.
  - Jalon 4: Validation de la Conception.
- **Phase 3**: Développement (3 semaines)
  - Jalon 5: Mise en Place de l'Environnement de Développement.
  - Jalon 6: Fin du Développement des Fonctionnalités de Base.
  - Jalon 7: Intégration des Modules.
- **Phase 4**: Tests
  - Jalon 8: Fin des Tests Internes des Fonctionnalités.
  - Jalon 9: Fin des Tests Bêta avec un Groupe d'Utilisateurs Pilotes.
- **Phase 5**: Déploiement
  - Jalon 10: Préparation de l'Environnement de Production.
  - Jalon 11: Déploiement de l'Application.
  - Jalon 12: Fin de la Formation des Utilisateurs.
- **Phase 6**: Suivi et Maintenance
  - Jalon 13: Suivi des Performances de l'Application.
  - Jalon 14: Fin de la Correction des Erreurs et des Problèmes.
  - Jalon 15: Fin des Mises à Jour Fonctionnelles en Réponse aux Retours des Utilisateurs.

## 10. Ressources <a name="ress"></a>
- Les étudiants sont encouragés à utiliser Angular CLI pour la gestion du projet.
- TypeScript avec Angular pour une programmation robuste.
- Intégration de MySQL pour le stockage des données.
- Exploration de NgRx pour une gestion avancée des flux de données.
- Utilisation de Spring Boot en backend pour une architecture robuste.
- Utilisation de Git, GitHub, Google Meet, et Trello pour la collaboration et la gestion de version.

# 11. Communication <a name="comm"></a>
- Importance cruciale de la communication claire et unifiée.
- Encouragement de la communication bidirectionnelle et de la flexibilité pour des révisions en cours de route.

## 12. Gestion des Risques <a name="gr"></a>
1. Risques liés aux technologies:
   - Problèmes potentiels liés aux plateformes technologiques.
   - Mesures préventives incluent des tests approfondis et le suivi des meilleures pratiques.
2. Risques de communication:
   - Risques liés à une communication insuffisante.
   - Mesures préventives incluent des canaux de communication clairs et des réunions régulières.

## 13. Conditions Contractuelles <a name="conc"></a>
1. Portée du Projet: Définir les fonctionnalités, les objectifs, et les livrables.
2. Calendrier et Délais: Spécifier les dates de début et de fin, ainsi que les délais.
3. Ressources Humaines: Détails sur les rôles de l'équipe, les responsabilités de l'encadrant, et les collaborations externes.
4. Propriété Intellectuelle: Préciser la propriété intellectuelle des éléments du projet.

## 14. Validation <a name="val"></a>
1. Critères de Réussite: Définir les critères pour le succès du projet.
2. Procédures de Test et de Validation: Élaborer des procédures détaillées.
3. Approvisionnement Final: Étapes pour obtenir l'approbation finale.
4. Formation des Utilisateurs: Sessions de formation pour enseignants et étudiants.
5. Maintenance Post-livraison: Modalités pour les mises à jour et le support technique après le déploiement.
