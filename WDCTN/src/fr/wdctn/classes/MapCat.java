package fr.wdctn.classes;

import java.util.Map;


/**
 * @author Loic
 * Classe permettant de créer une map de categorie
 */
public class MapCat 
{

        private Map<Integer, Categorie> lesCates;
        
        private int id;
        
        /**
         * Constructeur par défaut d'une map de categorie
         */
        public MapCat()
        {
                this.lesCates = null ;
                this.id = 0;
        }

        /**
         * Méthode permettant d'ajouter une categorie à la map
         * @param cate 
         */
        public void addCategorie(Categorie cate)
        {
                this.lesCates.put(id, cate);
                this.id ++;
        }
        
        /**
         * @param id
         * @return lesCates La categorie ayant l'id spécifié
         */
        public Categorie getCategorie(int id)
        {
                return this.lesCates.get(id);
        }
        
}
