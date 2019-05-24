# -*- coding: utf-8 -*-
"""
Created on Fri May 17 04:50:38 2019

@author: carole
"""

from datetime import date
from abc import ABC, abstractmethod

class Document(ABC):

	#attributes
    date = date.today().strtime("%d/%m/%Y") #put the date in string format
    year = date.today().strtime("%Y")	
    
	#constructor
    def __init__(self):
        self.date = date
        self.year = year
	
    @abstractmethod
    def getDate(self):
        return self.date
        pass
	
    @abstractmethod
    def modifier(self):
        #menu pour savoir ce qu on modifie
        pass
    
    def enregistrerPDF(self):
        #if convention changerStatut
        #if facture do not change status
        pass
     
    @abstractmethod
    def changerStatut(self):
        pass