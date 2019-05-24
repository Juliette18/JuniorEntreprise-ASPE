# -*- coding: utf-8 -*-
"""
Created on Fri May 17 04:52:51 2019

@author: carole
"""

from datetime import date
from abc import ABC, abstractmethod
from reportlab.pdfgen import canvas
from reportlab.lib.units import inch
import Document.py

class Convention(Document):
    
    numeroConvention = 0
    nomClient
    nomEtudiant
    descriptionMission
    mentionSpeciale = ""
    statut = "En cours"
    facture
    
    def __init__(self):
        super().__init__(self)
        numeroConvention=numeroConvention+1
        facture = self.creerFacture()
		
    def creerFacture():
        return Facture(numeroConvention) 
        pass
  
    #enregistrer les champs rempli par user
    # et update csv doc 
    def enregistrerBrouillonConvention(self):
        pass
    
    #enregistrer les champs rempli par user
    # et update csv doc 
    def enregistrerBrouillonFacture():
        #mentions speciales
        pass
        
    #methode PDF convention
    def créerPDFConvention(self):
        #on définit les variables contenant les infos     
        nom_client = str("Client: "+ self.nomClient)
        nom_etudiant = str("Etudiant: "+ self.nomEtudiant)
        description_mission = str("Mission: "+ self.descriptionMission)
        mention_speciale = str("Mention Spéciale: "+ self.mentionSpeciale)
        numero_convention = str("Numero de Convention: "+ self.numeroConvention)
        temp_date = str(date.today().strtime("%d/%m/%Y"))
        
        #variable contenant le nom du fichier: C pour convention
        nomfichier = "C_"+self.numeroConvention
        
        #open opens a file and writes in it
        #"a" for append and the + sign means if it is not there then create it
        f = open(nomfichier, "a+")
        
        #we write in the file
        f.write(numero_convention+"\n")
        f.write(nom_client+"\n")
        f.write(nom_etudiant+"\n")
        f.write(description_mission+"\n")
        f.write(mention_speciale+"\n")
        f.write("\n Fais le : "+temp_date)
        
        #read reads the file and stores it in a variable
        text = f.read
        
        #close the file
        f.close
        
        #os.system("pause")
        font = "Helvetica"
        font_size = 26    
        x = 5.0 * inch
        y = 8.0 * inch
        destination_file = ".\\"+nomfichier+".pdf"
        my_canvas = canvas.Canvas(destination_file)
        my_canvas.setFont(font, font_size)
        my_canvas.drawRightString(x, y, text)
        my_canvas.save()
        changerStatutConvention()
        #os.startfile(nomfichier+".pdf")
    
    def changerStatutConvention(self):
        if self.statut=="En cours":
            self.statut="Terminé"
        elif self.statut=="Terminé":
            self.statut=="Terminé"
    
    def getStatut(self):
        return self.statut
    
    def getNumeroConvention(self):
        return self.numeroConvention
    
    def getNomClient(self):
        return self.NomClient
    
    def getNomEtudiant(self):
        return self.nomEtudiant
    
    def getDescriptionMission(self):
        return self.descriptionMission
    
    def getMentionSpeciale(self):
        return self.mentionSpeciale
    