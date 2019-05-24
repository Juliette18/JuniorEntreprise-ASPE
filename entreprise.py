# -*- coding: utf-8 -*-
"""
Created on Fri May 17 14:29:32 2019

@author: Juliette
"""

class Entreprise: 
    
    def __init__(self,nom,adresse):
        
        self.nom= nom
        self.adresse=adresse
        self.factures=[]#ldob
        self.paiements= [] #liste/tableau d'objets
        self.debiteur= False
        self.sommeF
        self.sommeP
        self.sommeR
        
        
    def ajoutFacture(self,facture):
        self.factures.append(facture)
    
    def sommeFactures(self):     
        for f in self.factures:
            self.sommeF= self.sommeF + self.factures[f]
        
            
        return self.sommeFactures
    
    def ajoutPaiement(self,paiement):
        self.paiements.append(paiement)
        
    def sommePaiements (self):
        for p in self.paiements :
           self.sommeP= self.sommeP +self.paiements[p]
         
            
        return self.sommeP
    
    def sommeRestante (self):
        self.sommeR= self.sommeF-self.sommeP
        return self.sommeR
        
        
    def estDebiteur (self):
        if self.sommeR<0:
            self.debiteur=True
            
        return self.debiteur
    
        
            
     



    
    
    
    
        
    
                
            