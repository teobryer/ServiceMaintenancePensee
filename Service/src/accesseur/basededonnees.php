<?php 
error_reporting(E_ALL);
ini_set('display_errors', 1);

	$base = "inspiration";
	$hote = "localhost";
	$usager = "root";
	$motdepasse = "testtest";
	$dsn = "mysql:dbname=".$base.";host=" . $hote . ";charset=utf8";

	$basededonnees;
	try {
		$basededonnees = new PDO($dsn, $usager, $motdepasse);
	} catch (PDOException $e) {
		echo 'Connexion échouée : ' . $e->getMessage();
	}

?>