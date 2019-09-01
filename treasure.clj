;;-----------------------------------------------
;;@Student ID: 40053099
;;@Author: Simranjeet Singh
;;
;;
;;
;;------------------------------------------------
;;these functions will make code more readable
(defn gt [i j]
(> i j)
)
(defn eq [i j]
(= i j)
)
(defn ge [i j]
(>= i j)
)
(defn le [i j]
(<= i j)
)

(defn getDataFromFile []
(with-open [reader (clojure.java.io/reader "map.txt")]
(reduce conj [] (line-seq reader))))
(defn play [] 
(if (true? (recurFunction 0 0))
(do(println "The treasure is found! Here is the traced way represented with + sign in the map.")
(loop [x 0]
(when (< x iLen)
(do(println (nth current-map-tempo x)))
(recur (inc x)))))
(do(println "Sorry, I could not find the treasure :("))))
(defn creatematrix [row, col, value] 
(vec (replicate row (vec (replicate col value)))))
(defn recurFunction [i j]  
(def i (int i))
(def j (int j))
(def currentColumn (count (get current-map (int i))))
(if(or (ge i iLen) (ge j currentColumn))
(do(true? false))
(do(if(true? isGameOver)
(do(true? true))
(do
(def currentChar (get (get current-map-tempo i) j))
(if(and (eq \+ currentChar) (eq 1 (get (get tempboolmetrix i)j)))
(do(true? true))
(do
(if(eq 1 (get (get tempboolmetrix i) j))
(do(true? false))
(do(def currentRow (get tempboolmetrix i))
(def currentRow (assoc currentRow j 1))
(def tempboolmetrix (assoc tempboolmetrix i currentRow))
(cond ;; going priority wise
(eq \@ currentChar) (do
(def isGameOver true)
(true? true)
)
(eq \# currentChar) (do
(false? true)
)

:else (if(or (eq \- currentChar) (eq \+ currentChar))
(do
(def currentMapRow (get current-map-tempo i))
(def currentMapRow (assoc currentMapRow j \+))
(def current-map-tempo (assoc current-map-tempo i currentMapRow))
(if(and (eq 0 i) (eq 0 j))
(do
(def tempVar1 (recurFunction i (inc j))) 
(def tempVar2 (recurFunction (inc i) j))
(if(and (eq false tempVar1) (eq false tempVar2))
(do
(def currentMapRow (get current-map-tempo i))
(def currentMapRow (assoc currentMapRow j \!))
(def current-map-tempo (assoc current-map-tempo i currentMapRow))
(false? true)
)
(do(or tempVar1 tempVar2)))
)
(do
(if(and (eq i (- iLen 1)) (eq j 0))
(do
(def tempVar1 (recurFunction i (inc j) ))
(def tempVar2 (recurFunction (dec i), j ))
(if(or (eq false tempVar1) (eq false tempVar2))
(do
(def currentMapRow (get current-map-tempo i))
(def currentMapRow (assoc currentMapRow j \!))
(def current-map-tempo (assoc current-map-tempo i currentMapRow))
(false? true)
)
(do(or tempVar1 tempVar2))
))
(do
(if(and (eq i 0) (eq j (- (count (nth current-map i)) 1)))
(do
(def tempVar1 (recurFunction (inc i) j ))
(def tempVar2 (recurFunction i (dec j) ))
(if(or (eq false tempVar1) (eq false tempVar2))
(do
	(def currentMapRow (get current-map-tempo i))
	(def currentMapRow (assoc currentMapRow j \!))
	(def current-map-tempo (assoc current-map-tempo i currentMapRow))
	(false? true)
)
(do(or tempVar1 tempVar2))))
(do
(if(and (eq i (- iLen 1)) (eq j (- (count (nth current-map i)) 1)))
(do
  (def tempVar1 (recurFunction (dec i), j ))
  (def tempVar2 (recurFunction i (dec j) ))
  (if(or (eq false tempVar1) (eq false tempVar2))
	(do
	  (def currentMapRow (get current-map-tempo i))
	  (def currentMapRow (assoc currentMapRow j \!))
	  (def current-map-tempo (assoc current-map-tempo i currentMapRow))
	  (false? true)
	)
	(do(or tempVar1 tempVar2))))
(do
  (if(eq i 0)
	(do
		(def tempVar1 (recurFunction (inc i) j ))
		(def tempVar2 (recurFunction i (dec j) ))
		(def tempVar3 (recurFunction i (inc j) ))
		(if(or (and (eq false tempVar1) (eq false tempVar2)) (and (eq false tempVar1) (eq false tempVar3)) (and (eq false tempVar2) (eq false tempVar3)))
		  (do
			(def currentMapRow (get current-map-tempo i))
			(def currentMapRow (assoc currentMapRow j \!))
			(def current-map-tempo (assoc current-map-tempo i currentMapRow))
			(false? true)
		  )
		  (do(or tempVar1 tempVar2 tempVar3))))
	  (do 
		(if(eq j 0)
		  (do
			(def tempVar1 (recurFunction i (inc j) ))
			(def tempVar2 (recurFunction (dec i), j ))
			(def tempVar3 (recurFunction (inc i) j ))
			(if(or (and (eq false tempVar1) (eq false tempVar2)) (and (eq false tempVar1) (eq false tempVar3)) (and (eq false tempVar2) (eq false tempVar3)))
			  (do
				(def currentMapRow (get current-map-tempo i))
				(def currentMapRow (assoc currentMapRow j \!))
				(def current-map-tempo (assoc current-map-tempo i currentMapRow))
				(false? true)
			  )
			  (do(or tempVar1 tempVar2 tempVar3))))
		  (do
			(if(eq i (- iLen 1))
			(do
			  (def tempVar1 (recurFunction (dec i), j ))
			  (def tempVar2 (recurFunction i (dec j) ))
			  (def tempVar3 (recurFunction i (inc j) ))
			  (if(or (and (eq false tempVar1) (eq false tempVar2)) (and (eq false tempVar1) (eq false tempVar3)) (and (eq false tempVar2) (eq false tempVar3)))
				(do
				  (def currentMapRow (get current-map-tempo i))
				  (def currentMapRow (assoc currentMapRow j \!))
				  (def current-map-tempo (assoc current-map-tempo i currentMapRow))
				  (false? true)
				)
				(do(or tempVar1 tempVar2 tempVar3))))
			(do 
			  (if(eq j (- (count (nth current-map i)) 1))
				  (do
					(def tempVar1 (recurFunction (dec i), j ))
					(def tempVar2 (recurFunction i (dec j) ))
					(def tempVar3 (recurFunction (inc i) j ))
					(if(or (and (eq false tempVar1) (eq false tempVar2)) (and (eq false tempVar1) (eq false tempVar3)) (and (eq false tempVar2) (eq false tempVar3)))
					  (do
						(def currentMapRow (get current-map-tempo i))
						(def currentMapRow (assoc currentMapRow j \!))
						(def current-map-tempo (assoc current-map-tempo i currentMapRow))
						(false? true)
					  )
					  (do(or tempVar1 tempVar2 tempVar3))))
				  (do
					(def tempVar1 (recurFunction (dec i) j ))
					(def tempVar2 (recurFunction i (inc j) ))
					(def tempVar3 (recurFunction i (dec j) ))
					(def tempVar4 (recurFunction (inc i) j ))
(if(or (and (eq false tempVar1) (eq false tempVar2) (eq false tempVar3)) (and (eq false tempVar1) (eq false tempVar3)(eq false tempVar4)) (and (eq false tempVar2) (eq false tempVar3) (eq false tempVar4))(and (eq false tempVar1)(eq false tempVar4)(eq false tempVar2)))
					  (do
						(def currentMapRow (get current-map-tempo i))
						(def currentMapRow (assoc currentMapRow j \!))
						(def current-map-tempo (assoc current-map-tempo i currentMapRow))
						(false? true)
					  )
					  (do(or tempVar1 tempVar2 tempVar3 tempVar4))))))))))))))))))))
		  (do(println "INVALID MAP")))))))))))))


(def current-map (vec (getDataFromFile)))
(def iLen (count current-map))
(def current-map-tempo (vector [])) 
(def mapApproved true)
(def maxcols (count (get current-map 0)))
(loop [x 0]
(when (< x iLen)
(do
(def c (vec (char-array (nth current-map x))))
(cond 
(or (< maxcols (count c)) (gt maxcols (count c)))
(do (def mapApproved false)
(print ""))
)
(def current-map-tempo (assoc current-map-tempo x c))
)
(recur (inc x))))

(def tempboolmetrix (creatematrix iLen maxcols -1))
(def line (first current-map))
(def isGameOver false)
(if(false? mapApproved)
(do (println "The map you provided is not valid. Please give me the right map and retest."))
(do (play))
)
