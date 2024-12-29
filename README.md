# Gestion des Utilisateurs

Ce projet Java permet de gérer des utilisateurs dans un système en prenant en compte leur profil et en calculant leur salaire en fonction de leur rôle dans l'entreprise. Le système repose sur une hiérarchie de classes, notamment `Personne`, `Profile`, et `Utilisateur`, avec des fonctionnalités permettant de créer des utilisateurs, de gérer leur profil et de calculer leur salaire en fonction de leur poste.

## Classes Principales

### 1. **Personne**
La classe `Personne` représente une personne générale avec des informations personnelles telles que :
- **ID unique**
- **Nom**
- **Prénom**
- **Email**
- **Téléphone**
- **Salaire**

#### Attributs :
- `id` : ID unique pour chaque instance (généré automatiquement).
- `nom`, `prenom`, `mail`, `telephone`, `salaire` : Informations personnelles de la personne.

#### Méthodes :
- `calculerSalaire()` : Retourne le salaire de la personne (peut être surchargée dans les sous-classes).
- `afficher()` : Affiche les informations de la personne.

### 2. **Profile**
La classe `Profile` représente un profil d'utilisateur, tel que `Manager`, `Directeur Général`, ou `Chef de projet` ...

#### Attributs :
- `id` : ID unique du profil.
- `code` : Code représentant le profil (ex : "MG" pour Manager, "DG" pour Directeur Général, "CP" pour Chef de projet ...).
- `libelle` : Libellé du profil (ex : "Manager", "Directeur Général", "Chef de projet", ...).

#### Méthodes :
- Getters et setters pour accéder et modifier les attributs `code` et `libelle`.

### 3. **Utilisateur**
La classe `Utilisateur` hérite de la classe `Personne` et ajoute des informations spécifiques à un utilisateur dans un système d'entreprise.

#### Attributs supplémentaires :
- `login` : Login de l'utilisateur pour se connecter au système.
- `password` : Mot de passe de l'utilisateur.
- `service` : Service auquel appartient l'utilisateur.
- `typeProfile` : Profil de l'utilisateur, qui est un objet de la classe `Profile`.

#### Méthodes :
- `calculerSalaire()` : Calcule le salaire de l'utilisateur en fonction de son profil. Par exemple, les Managers bénéficient d'une augmentation de 10%, les Directeurs Généraux bénéficient d'une augmentation de 40%.
- `afficher()` : Affiche les informations complètes de l'utilisateur, y compris le salaire calculé en fonction de son profil.
