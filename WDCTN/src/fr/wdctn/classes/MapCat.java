package fr.wdctn.classes;

import java.util.Map;
public class MapCat 
{

        private Map<Integer, Categorie> lesCates;
        
        private int id;
        public MapCat()
        {
                this.lesCates = null ;
                this.id = 0;
        }

        public void addCategorie(Categorie cate)
        {
                this.lesCates.put(id, cate);
                this.id ++;
        }
        
        public Categorie getCategorie(int id)
        {
                return this.lesCates.get(id);
        }
        
}
