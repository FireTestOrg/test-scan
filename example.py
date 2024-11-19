def main():
    # Code smell: Hardcoded credentials
    username = "admin"
    password = "password123"

    # Potential bug: Exception not handled
    result = 10 / 0

    print("Login credentials:", username, password)

    # Code smell: Unused function
    def unused_function():
        pass


if __name__ == "__main__":
    main()
